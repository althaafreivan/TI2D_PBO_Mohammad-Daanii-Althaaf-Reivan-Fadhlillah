public class Main {
    public static void main(String[] args) {
        System.out.println("=== Data Komputer ===");
        Komputer pc = new Komputer("IBM", 8, 3);
        pc.nyalakanKomputer();
        pc.showInfo();

        System.out.println("\n=== Data Desktop ===");
        Desktop dt = new Desktop("Dell", 16, 4, "HP LaserJet");
        dt.nyalakanKomputer();
        dt.showInfo();

        System.out.println("\n=== Data Laptop ===");
        Laptop lp = new Laptop("Asus", 16, 4, 14);
        lp.nyalakanKomputer();
        lp.showInfo();
    }
}
