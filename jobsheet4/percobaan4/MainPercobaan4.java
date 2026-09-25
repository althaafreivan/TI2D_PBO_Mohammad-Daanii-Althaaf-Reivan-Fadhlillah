package jobsheet4.percobaan4;

public class MainPercobaan4 {
  public static void main(String[] args) {
    Penumpang p1 = new Penumpang("12345", "Mr. Krab");
    Gerbong g1 = new Gerbong("A", 10);

    g1.setPenumpang(p1, 1);

    System.out.println(g1.info());
  }
}