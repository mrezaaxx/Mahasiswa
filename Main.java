// ============================================================
// Main.java
// Class utama untuk menjalankan program
// ============================================================
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menyimpan 5 objek Mahasiswa ke dalam array (Panduan poin 2)
        Mahasiswa[] daftar = new Mahasiswa[5];
        daftar[0] = new Mahasiswa("Andi Pratama",  "2440001", "Teknik Informatika",    3.85);
        daftar[1] = new Mahasiswa("Budi Santoso",  "2440002", "Sistem Informasi",      3.25);
        daftar[2] = new Mahasiswa("Citra Dewi",    "2440003", "Teknik Elektro",        2.90);
        daftar[3] = new Mahasiswa("Dian Rahayu",   "2440004", "Manajemen Informatika", 3.60);
        daftar[4] = new Mahasiswa("Eko Wahyudi",   "2440005", "Ilmu Komputer",         3.50);

        // Menampilkan seluruh data mahasiswa dengan loop (Panduan poin 3)
        System.out.println("========================================");
        System.out.println("       DATA SELURUH MAHASISWA          ");
        System.out.println("========================================");
        for (Mahasiswa mhs : daftar) {
            mhs.tampilkanInfo();
            mhs.cekKelulusan();
            mhs.hitungPredikat();
            System.out.println();
        }

        // ── Update IPK berdasarkan input pengguna (Soal 2.4 & 2.5) ──
        System.out.println("========================================");
        System.out.println("           UPDATE IPK MAHASISWA        ");
        System.out.println("========================================");
        System.out.print("Masukkan NIM mahasiswa yang ingin diupdate: ");
        String nimInput = scanner.nextLine();

        System.out.print("Masukkan IPK baru: ");
        double ipkBaru = scanner.nextDouble();

        // Cari mahasiswa berdasarkan NIM menggunakan loop
        boolean ditemukan = false;
        for (Mahasiswa mhs : daftar) {
            if (mhs.getNim().equals(nimInput)) {
                mhs.updateIpk(ipkBaru);

                // Soal 2.5 - Tampilkan info & predikat setelah update
                System.out.println();
                mhs.tampilkanInfo();
                mhs.cekKelulusan();
                mhs.hitungPredikat();

                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Mahasiswa dengan NIM " + nimInput + " tidak ditemukan.");
        }

        scanner.close();
    }
}