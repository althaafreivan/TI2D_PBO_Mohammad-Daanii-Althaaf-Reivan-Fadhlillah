public class MainSoalA5 {
  

  public static void main(String[] args) {
      Smartphone Pixel8 = new Smartphone("Pixel 8", 4500);
      Charger charger25Watt = new Charger(25);

      Pixel8.tampilkanInfo();
      Pixel8.isiDaya(charger25Watt, 30);
      Pixel8.tampilkanInfo();
      Pixel8.isiDaya(charger25Watt, 10);
      Pixel8.tampilkanInfo();
      Pixel8.pakai(60);
      Pixel8.tampilkanInfo();
      Pixel8.pakai(50);
      Pixel8.tampilkanInfo();
      Pixel8.isiDaya(null,  10);
  }
}
