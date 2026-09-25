package Tugas;

public class KoperasiDemo {
    public static void main(String[] args) {
        // Instansiasi langsung memberikan argumen ke konstruktor (Passing Parameter)
        Anggota anggota1 = new Anggota("Iwan", "Jalan Mawar");

        // Cek status data awal setelah instansiasi (nama sudah 'Iwan', bukan 'null')
        System.out.println("Simpanan " + anggota1.getNama() + " : Rp " + anggota1.getSimpanan());

        // Mengubah data lewat setter
        anggota1.setNama("Iwan Setiawan");
        anggota1.setAlamat("Jalan Sukarno Hatta no 10");

        // Transaksi setor
        anggota1.setor(100000);
        System.out.println("Simpanan " + anggota1.getNama() + " : Rp " + anggota1.getSimpanan());

        // Transaksi pinjam
        anggota1.pinjam(5000);
        System.out.println("Simpanan " + anggota1.getNama() + " : Rp " + anggota1.getSimpanan());
    }
}