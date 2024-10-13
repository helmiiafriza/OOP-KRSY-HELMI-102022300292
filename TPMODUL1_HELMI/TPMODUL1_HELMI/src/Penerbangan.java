public class Penerbangan {
    private String nomorPenerbanga;
    private String bandaraKeberangkatan;
    private String bandaraTujuan;
    private String waktuKeberangkatan;
    private String waktuKedatangan;
    private float hargaTiket;

    public Penerbangan (String nP, String bK, String bT, String wB, String wD, float hT) {
        nomorPenerbanga = nP;
        bandaraKeberangkatan = bK;
        bandaraTujuan = bT;
        waktuKeberangkatan = wB;
        waktuKedatangan = wD;
        hargaTiket = hT;
     }

    public String getnomorPenerbangan() {
        return nomorPenerbanga;
    }

    public String getbandaraKeberangkatan() {
        return bandaraKeberangkatan;
    }

    public String getBandaraTujuan() {
        return bandaraTujuan;
    }

    public String getbandaraTujuan () {
        return bandaraKeberangkatan;
    }

    public String getwaktuKeberangkatan () {
        return waktuKeberangkatan;
    }

    public String getwaktuKedatangan (){
        return waktuKedatangan;
    }

    public float gethargaTiket () {
        return hargaTiket;
    }

    public void tampilDaftarPenerbangan() {
        System.out.println("Nomor Penerbangan: " + nomorPenerbanga);
        System.out.println("Bandara Keberangkatan: " + bandaraKeberangkatan);
        System.out.println("Bandara Tujuan: " + bandaraTujuan);
        System.out.println("Waktu Keberangkatan: " + waktuKeberangkatan);
        System.out.println("Waktu Kedatangan: " + waktuKedatangan);
        System.out.println("Harga Tiket: " + hargaTiket);
        System.out.println("----------------------------");
    }
}