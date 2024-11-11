package src;

class Komputer {
    // To do: Buatlah 3 variable sesuai ketentuan
    protected int jumlahKomputer;
    protected String namaWrnet;
    protected float hargaPerjam;
 // To do: Buatlah constructor pada class Komputer
    public Komputer(int jumlahKomputer, String namaWrnet, float hargaPerjam) {
        this.jumlahKomputer = jumlahKomputer;
        this.namaWrnet = namaWrnet;
        this.hargaPerjam = hargaPerjam;
    }
    // To do: Buatlah Method Informasi dengan isi yang sesuai dengan ketentuan 
    public void Informasi(){
        System.out.println(jumlahKomputer + "Jumlah komputer");
        System.out.println(namaWrnet + "Nama Warnet");
        System.out.println(hargaPerjam + "Harga Per Jam");
    }   

    

    // (boleh berbeda dengan output jurnal tetapi dengan cangkupan masih sesuai oleh materi modul!)

}