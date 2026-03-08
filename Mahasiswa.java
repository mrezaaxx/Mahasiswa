// ============================================================
// Mahasiswa.java
// Class model untuk data mahasiswa
// ============================================================
public class Mahasiswa {

    // Atribut
    private String nama;
    private String nim;
    private String jurusan;
    private double ipk;

    // Constructor untuk menginisialisasi data mahasiswa
    public Mahasiswa(String nama, String nim, String jurusan, double ipk) {
        this.nama    = nama;
        this.nim     = nim;
        this.jurusan = jurusan;
        this.ipk     = ipk;
    }

    // ── Getter & Setter ──
    public String getNama()    { return nama; }
    public String getNim()     { return nim; }
    public String getJurusan() { return jurusan; }

    public double getIpk() { return ipk; }

    public void setIpk(double ipk) {
        // Validasi nilai IPK harus berada di rentang 0.0 - 4.0
        if (ipk >= 0.0 && ipk <= 4.0) {
            this.ipk = ipk;
        } else {
            System.out.println("IPK tidak valid! Nilai harus antara 0.0 - 4.0");
        }
    }

    // ── Method tampilkanInfo() ───────────────────
    public void tampilkanInfo() {
        System.out.println("=== Data Mahasiswa ===");
        System.out.println("Nama    : " + nama);
        System.out.println("NIM     : " + nim);
        System.out.println("Jurusan : " + jurusan);
        System.out.println("IPK     : " + ipk);
    }

    // ── Method cekKelulusan() ────────────────────
    public void cekKelulusan() {
        if (ipk >= 3.00) {
            System.out.println("Status  : Lulus");
        } else {
            System.out.println("Status  : Belum Lulus");
        }
    }

    // ── Method hitungPredikat() ────────────────────
    public void hitungPredikat() {
        String predikat;
        if (ipk >= 3.75) {
            predikat = "Dengan Pujian";
        } else if (ipk >= 3.50) {
            predikat = "Sangat Memuaskan";
        } else if (ipk >= 3.00) {
            predikat = "Memuaskan";
        } else {
            predikat = "Perlu Perbaikan";
        }
        System.out.println("Predikat: " + predikat);
    }

    // ── Method updateIpk() ───────────────────────
    public void updateIpk(double ipkBaru) {
        setIpk(ipkBaru);
        System.out.println("Data berhasil diperbarui!");
    }
}