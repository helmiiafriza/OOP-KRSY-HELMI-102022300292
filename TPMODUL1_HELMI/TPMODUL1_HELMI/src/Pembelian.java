import java.util.ArrayList;
import java.util.Scanner;

public class Pembelian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Penerbangan> daftarPenerbangan = new ArrayList<>();
        Penumpang penumpang = null;
        Penerbangan penerbanganTerpilih = null;

        // Daftar Penerbangan
        daftarPenerbangan.add(new Penerbangan("GA001", "CGK, Jakarta", "DPS, Bali", "06:30", "08:15", 1200000));
        daftarPenerbangan.add(new Penerbangan("QZ020", "SUB, Surabaya", "KNO, Medan", "09:00", "11:45", 1350000));

        boolean running = true;
        while (running) {
            System.out.println("====== EAD Ticket Booking System ======");
            System.out.println("1. Tampilkan Daftar Penerbangan");
            System.out.println("2. Beli Tiket");
            System.out.println("3. Tampilkan Pesanan Tiket");
            System.out.println("4. Exit");
            System.out.print("Silahkan pilih menu: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();  // Membersihkan buffer setelah nextInt()

            switch (pilihan) {
                case 1:
                    System.out.println("Daftar Penerbangan:");
                    for (int i = 0; i < daftarPenerbangan.size(); i++) {
                        System.out.println((i + 1) + ". ");
                        daftarPenerbangan.get(i).tampilDaftarPenerbangan();
                        System.out.println();
                    }
                    break;
                case 2:
                    if (penumpang == null) {
                        System.out.println("Silahkan isi data diri Anda terlebih dahulu.");
                        System.out.print("Masukkan NIK: ");
                        String NIK = scanner.nextLine();
                        System.out.print("Masukkan Nama Depan: ");
                        String namaDepan = scanner.nextLine();
                        System.out.print("Masukkan Nama Belakang: ");
                        String namaBelakang = scanner.nextLine();
                        penumpang = new Penumpang(NIK, namaDepan, namaBelakang);
                    }
                    System.out.println("\nTerima Kasih Telah Mengisi Data Pelanggan. Silahkan Pilih Tiket Penerbangan Yang Tersedia");
                    for (int i = 0; i < daftarPenerbangan.size(); i++) {
                        System.out.println((i + 1) + ". ");
                        daftarPenerbangan.get(i).tampilDaftarPenerbangan();
                        System.out.println();
                    }
                    System.out.print("Pilih nomor penerbangan (1-" + daftarPenerbangan.size() + "): ");
                    int pilihanPenerbangan = scanner.nextInt() - 1;
                    scanner.nextLine();  // Membersihkan buffer setelah nextInt()
                    if (pilihanPenerbangan >= 0 && pilihanPenerbangan < daftarPenerbangan.size()) {
                        penerbanganTerpilih = daftarPenerbangan.get(pilihanPenerbangan);
                        System.out.println("Pemesanan Tiket Berhasil Dilakukan, Cek Pesanan Tiket pada Menu (3)");
                    } else {
                        System.out.println("Penerbangan Tidak Ada");
                    }
                    break;
                case 3:
                    if (penumpang == null || penerbanganTerpilih == null) {
                        System.out.println("Pembelian Tiket Tidak Ada");
                    } else {
                        System.out.println("====== Detail Tiket Penerbangan ======");
                        penumpang.tampilDaftarPenumpang();
                        penerbanganTerpilih.tampilDaftarPenerbangan();
                    }
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    running = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid, silahkan coba lagi.");
            }
        }
        scanner.close();
    }
}
