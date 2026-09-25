public class BotolMinum {
  private String brand;
  private int volumeML;

  public BotolMinum() {
  }

  public BotolMinum(String brand, int volumeML) {
    this.brand = brand;
    this.volumeML = volumeML;
  }

  public void isiAir(int volume) {
    this.volumeML += volume;
    System.out.println("Mengisi air sebanyak " + volume + " ml. Total volume: " + volumeML + " ml.");
  }

  public void minum(int volume) {
    if (this.volumeML >= volume) {
      this.volumeML -= volume;
      System.out.println("Meminum air sebanyak " + volume + " ml. Sisa air: " + volumeML + " ml.");
    } else {
      System.out.println("Air tidak mencukupi! Sisa hanya " + volumeML + " ml.");
      this.volumeML = 0;
    }
  }

  public void printInformasi() {
    System.out.println("Brand: " + brand);
    System.out.println("Volume Air: " + volumeML + " ml");
  }
}
