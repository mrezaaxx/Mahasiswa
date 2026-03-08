public class Mahasiswa {
    String nama;
    String nim;
    String jurusan;
    double ipk;

    public Mahasiswa(String nama, String nim, String jurusan, double ipk) {
        this.nama    = nama;
        this.nim     = nim;
        this.jurusan = jurusan;
        this.ipk     = ipk;
    }

    public void tampilkanInfo() {
        System.out.println("=============================");
        System.out.println("Nama    : " + nama);
        System.out.println("NIM     : " + nim);
        System.out.println("Jurusan : " + jurusan);
        System.out.println("IPK     : " + ipk);
        System.out.println("=============================");
    }

    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("Andi Pratama",    "2021001", "Teknik Informatika",     3.85);
        Mahasiswa mahasiswa2 = new Mahasiswa("Budi Santoso",    "2021002", "Sistem Informasi",       3.50);
        Mahasiswa mahasiswa3 = new Mahasiswa("Citra Dewi",      "2021003", "Teknik Elektro",         2.90);
        Mahasiswa mahasiswa4 = new Mahasiswa("Dian Rahayu",     "2021004", "Manajemen Informatika",  3.10);
        Mahasiswa mahasiswa5 = new Mahasiswa("Eko Wahyudi",     "2021005", "Ilmu Komputer",          3.65);

        System.out.println("\n===== DATA MAHASISWA =====\n");
        mahasiswa1.tampilkanInfo();
        mahasiswa2.tampilkanInfo();
        mahasiswa3.tampilkanInfo();
        mahasiswa4.tampilkanInfo();
        mahasiswa5.tampilkanInfo();
    }
}