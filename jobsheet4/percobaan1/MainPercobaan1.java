package jobsheet4.percobaan1;

public class MainPercobaan1 {
  public static void main(String[] args) {
    Processor p1 = new Processor();
    p1.setMerk("Intel i5");
    p1.setCache(4);

    Laptop ll = new Laptop();
    ll.setMerk("Thinkpad");
    ll.setProc(p1);
    ll.info();

    Laptop l2 = new Laptop("Thinkpad", new Processor("Intel i5", 3));
    l2.info();
  }
}
