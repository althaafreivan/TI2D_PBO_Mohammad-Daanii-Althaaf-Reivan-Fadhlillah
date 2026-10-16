public class ReservasiMember extends Reservasi {
  private String noMember;

  public ReservasiMember(String kode, int jumlahMalam, String noMember) {
    super(kode, jumlahMalam);
    this.noMember = noMember;
  }

  @Override
  public int hitungTotal(int Tarif) {
    int total = super.hitungTotal(Tarif);
    total = (int) (total - (total * 0.15)); 
    return total;
  }

  @Override
  public String getJenis() {
    return "Member";
  }
}
