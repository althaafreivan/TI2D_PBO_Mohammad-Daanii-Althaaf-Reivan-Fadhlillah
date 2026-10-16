public class Hotel {
  private String nama;
  private Kamar[] daftarKamar;
  private Manajer manajer;

  public Hotel(String nama, int jumlahKamar) {
    this.nama = nama;
    this.daftarKamar = new Kamar[jumlahKamar];

    for(int i = 0; i < jumlahKamar; i++) {
      String nomorKamar = String.valueOf(i + 1);
      if(i < 2) {
        daftarKamar[i] = new Kamar(nomorKamar, "Deluxe", 750000);
        continue;
      }else{
        daftarKamar[i] = new Kamar(nomorKamar, "Standar", 500000);
      }
    }
  }

  public void setManajer(Manajer manajer) {
    this.manajer = manajer;
  }

  public  void checkIn(Reservasi reservasi){
    for(int i = 2; i < daftarKamar.length; i++) {
      if(daftarKamar[i].isKosong()) {
        daftarKamar[i].isi(reservasi);
        break;
      }
    }
  }

  public  void checkIn(Reservasi reservasi, int nomorKamar){
    Reservasi reservasi1 = reservasi;
    for(int i = 0; i < daftarKamar.length; i++) {
      if(daftarKamar[i].getNomor().equals(String.valueOf(nomorKamar)) && daftarKamar[i].isKosong()) {
        daftarKamar[i].isi(reservasi);
        break;
      }
    }
  }

  public Kamar getKamar(int nomor){
    return daftarKamar[nomor - 1];
  }

  public  void tampilInfo(){
    System.out.println("Info Hotel: " + nama);
    System.out.println("Manajer: " + manajer.getNama());
  }

}
