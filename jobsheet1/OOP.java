package jobsheet1;

public class OOP {
  public static void main(String[] args) {
    Product product1 = new Product("Coffee", 120000.0f);
    Product product2 = new Product("Sugar", 30000.0f);
    System.out.println(product1.getName() + ": " + product1.total(3));
    System.out.println(product1.getName() + ": " + product2.total(1));
    System.out.println("Total Belanja: " + Product.totBelanja());
  }
}

class Product{
  private final String itemName;
  private final float price;
  static int totBrg=0;

  public Product(String itemName, float price){
    this.itemName = itemName;
    this.price = price;
    totBrg++;
  }

  public float total(int quantity){
    return price*quantity;
  }

  public String getName(){
    return itemName;
  }

  public static int totBelanja(){
    return totBrg;
  }
}
