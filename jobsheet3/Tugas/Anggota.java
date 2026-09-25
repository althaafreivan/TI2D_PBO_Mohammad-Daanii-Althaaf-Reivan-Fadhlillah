package Tugas;
public class Anggota {
    private String nama;
    private String alamat;
    private float simpanan;

    // --- STEP: Tambahkan Konstruktor Berparameter ---
    public Anggota(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
        this.simpanan = 0; // Memastikan simpanan anggota baru selalu 0
    }

    // Setter & Getter Nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    // Setter & Getter Alamat
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getAlamat() {
        return alamat;
    }

    // Getter Simpanan
    public float getSimpanan() {
        return simpanan;
    }

    // Method Transaksi Setor & Pinjam
    public void setor(float uang) {
        simpanan += uang;
    }

    public void pinjam(float uang) {
        simpanan -= uang;
    }
}