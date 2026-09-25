public class TasGunung extends tas {
  private boolean rainCover;
  private int panjangTorso;

  public TasGunung() {
    super();
  }

  public TasGunung(String brand, String color, int capacity, boolean rainCover, int panjangTorso) {
    super(brand, color, capacity);
    this.rainCover = rainCover;
    this.panjangTorso = panjangTorso;
  }

  public void pasangRainCover(boolean status) {
    this.rainCover = status;
    System.out.println(status ? "Rain cover berhasil dipasang." : "Rain cover dilepas.");
  }

  public void adjustTorso(int panjang) {
    this.panjangTorso = panjang;
    System.out.println("Panjang torso disesuaikan menjadi: " + panjang + " cm");
  }

  @Override
  public void printInformasi() {
    super.printInformasi();
    System.out.println("Rain Cover: " + (rainCover ? "Terpasang" : "Tidak Terpasang"));
    System.out.println("Panjang Torso: " + panjangTorso + " cm");
  }
}
