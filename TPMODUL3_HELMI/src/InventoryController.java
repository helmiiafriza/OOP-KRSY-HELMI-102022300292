import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;

public class InventoryController {
    @FXML
    private TableView<Album> tableView;
    @FXML
    private TableColumn<Album, String> columnAlbumName;
    @FXML
    private TableColumn<Album, String> columnArtist;
    @FXML
    private TableColumn<Album, Integer> columnTotal;
    @FXML
    private TableColumn<Album, Integer> columnAvailable;

    @FXML
    private TextField txtAlbumName;
    @FXML
    private TextField txtArtist;
    @FXML
    private TextField txtTotal;

    private ObservableList<Album> albumList;

    @FXML
    public void initialize() {
        albumList = FXCollections.observableArrayList();

        columnAlbumName.setCellValueFactory(cellData -> cellData.getValue().albumNameProperty());
        columnArtist.setCellValueFactory(cellData -> cellData.getValue().artistProperty());
        columnTotal.setCellValueFactory(cellData -> cellData.getValue().totalProperty().asObject());
        columnAvailable.setCellValueFactory(cellData -> cellData.getValue().availableProperty().asObject());

        tableView.setItems(albumList);
    }

    @FXML
    private void handleAddAlbum() {
        try {
            String albumName = txtAlbumName.getText();
            String artist = txtArtist.getText();
            int total = Integer.parseInt(txtTotal.getText());

            Album album = new Album(albumName, artist, total);
            albumList.add(album);

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Berhasil");
            alert.setHeaderText(null);
            alert.setContentText("Album Berhasil ditambahkan!");
            alert.showAndWait();
        } catch (NumberFormatException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Gagal Masukin");
            alert.setContentText("Please masukan data yang benar");
            alert.showAndWait();
        }
    }

    @FXML
    private void handleRentAlbum() {
        Album selectedAlbum = tableView.getSelectionModel().getSelectedItem();
        if (selectedAlbum != null && selectedAlbum.getAvailable() > 0) {
            selectedAlbum.setAvailable(selectedAlbum.getAvailable() - 1);
            selectedAlbum.setRented(selectedAlbum.getRented() + 1);
            tableView.refresh();
        }
    }

    @FXML
    private void handleDeleteAlbum() {
        Album selectedAlbum = tableView.getSelectionModel().getSelectedItem();
        if (selectedAlbum != null) {
            albumList.remove(selectedAlbum);
        }
    }

    @FXML
    private void handleUpdateAlbum(MouseEvent event) {
        Album selectedAlbum = tableView.getSelectionModel().getSelectedItem();
        if (selectedAlbum != null) {
            selectedAlbum.setAlbumName(txtAlbumName.getText());
            selectedAlbum.setArtist(txtArtist.getText());
            selectedAlbum.setTotal(Integer.parseInt(txtTotal.getText()));
            selectedAlbum.setAvailable(selectedAlbum.getTotal() - selectedAlbum.getRented());
            tableView.refresh();
        }
    }
}