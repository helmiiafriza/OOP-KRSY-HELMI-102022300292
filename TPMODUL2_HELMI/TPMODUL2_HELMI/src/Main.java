public class Main {
    public static void main(String[] args){
        System.out.println("Detail Hewan\n");

    Kucing kucing = new Kucing("Momo", 2, "Persia");
    System.out.println("ini adalah ! " + kucing.nama);
    kucing.suara();
    kucing.makan();
    kucing.makan("ikan");
    System.out.println();
    
    Burung burung = new Burung("RIo", 1, "Hijau");
    System.out.println("Ini adalah ! " + burung.nama);
    burung.suara();
    burung.makan();
    burung.makan("biji-bijian");
    
    System.out.println();
    kucing.infoHewan();
    burung.infoHewan();
   
    }      
    
    

    
}
