public class Demo {
  public static void main(String[] args) {
    System.out.println("========================================");
    System.out.println("          DEMO OBJEK TAS GUNUNG         ");
    System.out.println("========================================");
    TasGunung tasGunung = new TasGunung("Osprey", "Hijau Army", 3, false, 48);
    tasGunung.loadItem("Tenda Dome");
    tasGunung.loadItem("Sleeping Bag");
    tasGunung.loadItem("Matras Camping");
    tasGunung.loadItem("Kompor Portable");
    tasGunung.takeoutLatestItem();
    tasGunung.pasangRainCover(true);
    tasGunung.adjustTorso(50);
    tasGunung.printInformasi();
    System.out.println();

    System.out.println("========================================");
    System.out.println("          DEMO OBJEK TAS LAPTOP         ");
    System.out.println("========================================");
    TasLaptop tasLaptop = new TasLaptop("Bodypack", "Hitam", 2, 15.6, true);
    tasLaptop.loadItem("Laptop MacBook Pro");
    tasLaptop.loadItem("Charger Adaptor");
    tasLaptop.takeoutLatestItem();
    tasLaptop.cekKesesuaianLaptop(14.0);
    tasLaptop.cekKesesuaianLaptop(17.0);
    tasLaptop.setWaterproof(false);
    tasLaptop.printInformasi();
    System.out.println();

    System.out.println("========================================");
    System.out.println("          DEMO OBJEK BOTOL MINUM        ");
    System.out.println("========================================");
    BotolMinum botolMinum = new BotolMinum("Hydro Flask", 500);
    botolMinum.isiAir(250);
    botolMinum.minum(150);
    botolMinum.minum(200);
    botolMinum.printInformasi();
    System.out.println();

    System.out.println("========================================");
    System.out.println("            DEMO OBJEK SEPATU           ");
    System.out.println("========================================");
    Sepatu sepatu = new Sepatu("Nike Pegasus", 42);
    sepatu.pakai("Lari Maraton");
    sepatu.bersihkan();
    sepatu.printInformasi();
    System.out.println("========================================");
  }
}
