public class Reservasi {
  protected String kode;
  protected int jumlahMalam;
  private Tamu tamu;

  public Reservasi(String kode, int jumlahMalam) {
    this.kode = kode;
    this.jumlahMalam = jumlahMalam;
  }
  
  public void setTamu(Tamu tamu) {
    this.tamu = tamu;
  }

  public Tamu getTamu() {
    return tamu;
  }

  public int hitungTotal(int Tarif){
    int total = 0;
    total = Tarif * jumlahMalam;
    return total;
  }

    public int hitungTotal(int Tarif, boolean extraBed){
    int total = 0;
    total = Tarif * jumlahMalam;
    total = (int) (total + (total * 0.1)); 
    if(extraBed){
      total += (150000*jumlahMalam);
    }
    return total;
  }

  public String getJenis(){
    String jenis = "";
    return  jenis;
  }
}