public class MainRekening {
    public static void main(String[] args) {
        System.out.println("=== Uji Coba Class Rekening ===");
        Rekening rek = new Rekening(1000000);
        System.out.println("Saldo awal rekening : Rp" + rek.getSaldo());
        rek.simpanUang(500000);
        System.out.println("Saldo saat ini      : Rp" + rek.getSaldo());
        rek.ambilUang(200000);
        System.out.println("Saldo saat ini      : Rp" + rek.getSaldo());
        rek.ambilUang(2000000); // Penarikan melebihi saldo

        System.out.println("\n=== Uji Coba Class Deposito ===");
        Deposito dep = new Deposito(5000000, 12);
        System.out.println("Saldo deposito      : Rp" + dep.getSaldo());
        System.out.println("Masa tenor          : " + dep.getTenor() + " bulan");
        System.out.println("Bunga per bulan     : " + (dep.getBungaPerBulan() * 100) + "%");
        System.out.println("Total nilai bunga   : Rp" + (long) dep.getNilaiBunga());
    }
}
