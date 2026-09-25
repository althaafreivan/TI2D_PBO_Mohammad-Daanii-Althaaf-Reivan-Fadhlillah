public class Sepatu {
  private String brand;
  private int size;

  public Sepatu() {
  }

  public Sepatu(String brand, int size) {
    this.brand = brand;
    this.size = size;
  }

  public void pakai(String aktivitas) {
    System.out.println("Sepatu " + brand + " (Ukuran " + size + ") sedang digunakan untuk " + aktivitas + ".");
  }

  public void bersihkan() {
    System.out.println("Sepatu " + brand + " telah dibersihkan dan siap digunakan kembali.");
  }

  public void printInformasi() {
    System.out.println("Brand: " + brand);
    System.out.println("Ukuran: " + size);
  }
}
