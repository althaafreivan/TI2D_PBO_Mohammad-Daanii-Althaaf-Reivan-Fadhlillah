import java.util.Vector;

public class tas {
  private String brand;
  private String color;
  private int capacity;
  private Vector<String> item;

  public tas() {
    this.item = new Vector<>();
  }

  public tas(String brand, String color, int capacity) {
    this.brand = brand;
    this.color = color;
    this.capacity = capacity;
    this.item = new Vector<>();
  }

  public void loadItem(String item) {
    if (this.item.size() < this.capacity) {
      this.item.add(item);
    } else {
      System.out.println("Kapasitas penuh.");
    }
  }

  public void takeoutLatestItem() {
    if (item.size() > 0) System.out.println("Barang " + item.remove(item.size() - 1) + " dikeluarkan");
  }

  public void printInformasi() {
    System.out.println("Brand: " + brand);
    System.out.println("Color: " + color);
    System.out.println("Capacity: " + capacity);
    System.out.println("Item: " + item);
  }
}