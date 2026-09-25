public class Smartphone {
  String merk;
  Baterai baterai;

  public Smartphone(String merk, int kapasitasBaterai) {
    this.merk = merk;
    this.baterai = new Baterai(kapasitasBaterai);
  }

  public void isiDaya(Charger c, int menit) {
    if(c != null){
      int dayaCharger = c.getDaya();
      baterai.tambah((dayaCharger*menit)/10);
    }else{
      System.out.println("Charger Tidak Terdeteksi.");
    }
  }

  public void pakai(int menit){
    if (baterai.kapasitas>0) {
        baterai.kurangi(menit);
    }else{
      System.out.println("HP nya sudah mati.");
    }

  }

  public void tampilkanInfo(){
      System.out.println(merk + "\t|" + "\tBaterai\t"+ baterai.kapasitas + " mAh" + "\t|\t" +baterai.getPersen() + "%");
  }
}
