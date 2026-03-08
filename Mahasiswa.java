import java.util.Scanner;
public class Mahasiswa {
    String nama;
    String nim;
    String jurusan;
    private double ipk;

    public Mahasiswa(String nama, String nim, String jurusan, double ipk) {
        this.nama    = nama;
        this.nim     = nim;
        this.jurusan = jurusan;
        this.ipk     = ipk;
    }

    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        if (ipk >= 0.0 && ipk <= 4.0) {
            this.ipk = ipk;
        } else {
            System.out.println("IPK tidak valid! Nilai harus antara 0.0 - 4.0");
        }
    }

    public String getNama()    { return nama; }
    public String getNim()     { return nim; }
    public String getJurusan() { return jurusan; }

    public void tampilkanInfo() {
        System.out.println("=============================");
        System.out.println("Nama    : " + nama);
        System.out.println("NIM     : " + nim);
        System.out.println("Jurusan : " + jurusan);
        System.out.println("IPK     : " + ipk);
        System.out.println("=============================");
    }

    public void cekKelulusan() {
        if (ipk >= 3.00) {
            System.out.println("Status  : LULUS");
        } else {
            System.out.println("Status  : BELUM LULUS");
        }
    }

    public void updateIpk(double ipkBaru) {
        System.out.println("\n Memperbarui IPK " + nama + "...");
        System.out.println("   IPK Lama : " + ipk);
        setIpk(ipkBaru);
        System.out.println("   IPK Baru : " + this.ipk);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Mahasiswa[] daftarMhs = {
            new Mahasiswa("Andi Pratama",  "2021001", "Teknik Informatika",    3.85),
            new Mahasiswa("Budi Santoso",  "2021002", "Sistem Informasi",      3.50),
            new Mahasiswa("Citra Dewi",    "2021003", "Teknik Elektro",        2.90),
            new Mahasiswa("Dian Rahayu",   "2021004", "Manajemen Informatika", 3.10),
            new Mahasiswa("Eko Wahyudi",   "2021005", "Ilmu Komputer",         2.75)
        };

        // Tampilkan info & status kelulusan semua mahasiswa
        System.out.println("\n╔══════════════════════════════╗");
        System.out.println("║     DATA SELURUH MAHASISWA   ║");
        System.out.println("╚══════════════════════════════╝");
        for (Mahasiswa mhs : daftarMhs) {
            mhs.tampilkanInfo();
            mhs.cekKelulusan();
            System.out.println();
        }

        System.out.println("╔══════════════════════════════╗");
        System.out.println("║        UPDATE IPK            ║");
        System.out.println("╚══════════════════════════════╝");

        System.out.println("Pilih mahasiswa yang akan diupdate IPK-nya:");
        for (int i = 0; i < daftarMhs.length; i++) {
            System.out.println((i + 1) + ". " + daftarMhs[i].getNama() + " (IPK: " + daftarMhs[i].getIpk() + ")");
        }

        System.out.print("\nMasukkan nomor mahasiswa (1-5): ");
        int pilihan = scanner.nextInt() - 1;

        System.out.print("Masukkan IPK baru            : ");
        double ipkBaru = scanner.nextDouble();

        daftarMhs[pilihan].updateIpk(ipkBaru);

        System.out.println("\n╔══════════════════════════════╗");
        System.out.println("║   INFO MAHASISWA SETELAH     ║");
        System.out.println("║        UPDATE IPK            ║");
        System.out.println("╚══════════════════════════════╝");
        daftarMhs[pilihan].tampilkanInfo();
        daftarMhs[pilihan].cekKelulusan();

        scanner.close();
    }
}