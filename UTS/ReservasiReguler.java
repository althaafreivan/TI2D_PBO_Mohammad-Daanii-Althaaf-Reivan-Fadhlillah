public class ReservasiReguler extends Reservasi {
  public ReservasiReguler(String kode, int jumlahMalam) {
    super(kode, jumlahMalam);
  }

  @Override
  public int hitungTotal(int Tarif) {
    int total = super.hitungTotal(Tarif);
    total = (int) (total + (total * 0.1)); 
    return total;
  }

  @Override
  public String getJenis() {
    return "Reguler";
  }
}
