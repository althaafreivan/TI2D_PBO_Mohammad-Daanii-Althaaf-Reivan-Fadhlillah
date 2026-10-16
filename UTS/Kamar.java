public class Kamar {
  private String nomor;
  private String tipe;
  private int tarif;
  private Reservasi reservasi;

  public Kamar(String nomor, String tipe, int tarif) {
    this.nomor = nomor;
    this.tipe = tipe;
    this.tarif = tarif;
  }

  public void isi(Reservasi reservasi) {
    this.reservasi = reservasi;
  }

  public Reservasi getReservasi() {
    return reservasi;
  }

  public boolean isKosong() {
    return reservasi == null;
  }

  public String getNomor() {
    return nomor;
  }

  public String getTipe() {
    return tipe;
  }

  public int getTarif() {
    return tarif;
  }
}