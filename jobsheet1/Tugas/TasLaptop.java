public class TasLaptop extends tas {
  private double slotLaptopInch;
  private boolean isWaterproof;

  public TasLaptop() {
    super();
  }

  public TasLaptop(String brand, String color, int capacity, double slotLaptopInch, boolean isWaterproof) {
    super(brand, color, capacity);
    this.slotLaptopInch = slotLaptopInch;
    this.isWaterproof = isWaterproof;
  }

  public void cekKesesuaianLaptop(double ukuranLaptop) {
    if (ukuranLaptop <= this.slotLaptopInch) {
      System.out.println("Laptop " + ukuranLaptop + " inch muat di dalam slot (" + this.slotLaptopInch + " inch).");
    } else {
      System.out.println("Laptop " + ukuranLaptop + " inch terlalu besar untuk slot (" + this.slotLaptopInch + " inch).");
    }
  }

  public void setWaterproof(boolean status) {
    this.isWaterproof = status;
    System.out.println("Status fitur waterproof: " + (status ? "Aktif" : "Nonaktif"));
  }

  @Override
  public void printInformasi() {
    super.printInformasi();
    System.out.println("Slot Laptop: " + slotLaptopInch + " inch");
    System.out.println("Waterproof: " + (isWaterproof ? "Ya" : "Tidak"));
  }
}
