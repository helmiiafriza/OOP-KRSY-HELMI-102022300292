class KomputerPremium extends Komputer {
        // To do: Buatlah 1 variable sesuai ketentuan
        private boolean ruangPrivat;

        // To do: Buatlah constructor pada class KomputerPremium
        public KomputerPremium(int jumlahKomputer, String namaWrnet, float hargaPerjam, boolean ruangPrivat) {
            super(jumlahKomputer, namaWrnet, hargaPerjam);
            this.ruangPrivat = ruangPrivat;
        }
     // To do: Buatlah Method Informasi memakai Polymorphism Override dengan isi yang sesuai dengan ketentuan 
     public void Informasi(){
        super.Informasi();
        if (ruangPrivat){
            System.out.println("Status");
            System.out.println("Fasilitas Ruangan Premium");
            System.out.println("Rungan ber-AC pribadi");
            System.out.println("sofa gaming exclusive");
            System.out.println("Komputer spesifikasi tinggi");
            System.out.println("Koneksi internet dedicated 100Mbps");
        }
            
        else {
            System.out.println("Status");
            System.out.println("Fasilitas Ruangan Standar");
            System.out.println("Ruangan gerah");
            System.out.println("sofa majapahit");
            System.out.println("Komputer spesifikasi rendah");
            System.out.println("Koneksi internet dedicated 1Mbps");
        }
            
     }

     public void pesan(int nomorKomputer){
        System.out.println("Memesan nomor komputer" + nomorKomputer);
     }

     public void TambahLayanan(String makanan){
        System.out.println(" Menambah layanan makanan" + makanan);
     }

     public void TambahLayanan(String makanan, String minuman){
        System.out.println("Menambah layanan makanan" + makanan + minuman );
     }


    

    
  
    // (boleh berbeda dengan output jurnal tetapi dengan cangkupan masih sesuai oleh materi modul!)
    
    // To do: Buatlah method Pesan sesuai dengan ketentuan
    
    // To do: Buatlah method TambahLayanan sesuai dengan ketentuan
    
    // To do: Buatlah method TambahLayanan memakai Polymorphism Overloading sesuai dengan ketentuan
}
