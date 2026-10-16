public class Deposito extends Rekening {
    private double BungaPerBulan;
    private int Tenor;

    public Deposito(int saldoAwal, int masaTenor) {
        super(saldoAwal);
        this.Tenor = masaTenor;
        // Menentukan persentase bunga per bulan (misalnya berdasarkan lama tenor)
        if (masaTenor >= 12) {
            this.BungaPerBulan = 0.05; // 5% per bulan
        } else if (masaTenor >= 6) {
            this.BungaPerBulan = 0.04; // 4% per bulan
        } else {
            this.BungaPerBulan = 0.03; // 3% per bulan
        }
    }

    public Deposito(int saldoAwal, int masaTenor, double bungaPerBulan) {
        super(saldoAwal);
        this.Tenor = masaTenor;
        this.BungaPerBulan = bungaPerBulan;
    }

    public double getBungaPerBulan() {
        return BungaPerBulan;
    }

    public void setBungaPerBulan(double bungaPerBulan) {
        this.BungaPerBulan = bungaPerBulan;
    }

    public int getTenor() {
        return Tenor;
    }

    public void setTenor(int tenor) {
        this.Tenor = tenor;
    }

    public double getNilaiBunga() {
        // Nilai bunga total = Saldo * BungaPerBulan * Tenor
        return Saldo * BungaPerBulan * Tenor;
    }
}
