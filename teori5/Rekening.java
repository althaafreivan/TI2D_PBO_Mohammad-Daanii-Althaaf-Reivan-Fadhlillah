public class Rekening {
    // Saldo dengan akses protected sesuai diagram (# Saldo : int)
    protected int Saldo;

    public Rekening() {
        this.Saldo = 0;
    }

    public Rekening(int saldoAwal) {
        this.Saldo = saldoAwal;
    }

    public int getSaldo() {
        return Saldo;
    }

    public void simpanUang(int jumlah) {
        if (jumlah > 0) {
            Saldo += jumlah;
            System.out.println("Berhasil menyimpan uang: Rp" + jumlah);
        } else {
            System.out.println("Jumlah simpanan harus lebih dari 0.");
        }
    }

    public void ambilUang(int jumlah) {
        if (jumlah > 0 && Saldo >= jumlah) {
            Saldo -= jumlah;
            System.out.println("Berhasil mengambil uang: Rp" + jumlah);
        } else if (jumlah > Saldo) {
            System.out.println("Gagal mengambil uang. Saldo tidak mencukupi (Saldo: Rp" + Saldo + ")");
        } else {
            System.out.println("Jumlah penarikan harus lebih dari 0.");
        }
    }
}
