public class MainVarian8 {
  public static void main(String[] args) {
    Hotel hotel = new Hotel("Hotel Tugu", 5);
    hotel.setManajer(new Manajer("Ibu Ratna"));
    Tamu tamu1 = new Tamu("Bima", "3148000000");
    Tamu tamu2 = new Tamu("Citra", "3148000001");

    ReservasiReguler r1 = new ReservasiReguler("RSV-01", 2);
    r1.setTamu(tamu1);
    ReservasiMember r2 = new ReservasiMember("RSV-02", 3, "MBR-77");
    r2.setTamu(tamu2);

    hotel.checkIn(r1);
    hotel.checkIn(r2, 1);

    Resepsionis resepsionis = new Resepsionis("Pak Budi");
    resepsionis.cetakInvoice(hotel.getKamar(3));
    resepsionis.cetakInvoice(hotel.getKamar(1));

    System.out.println("Total RSV-01 dengan extra bed: " + r1.hitungTotal(500000, true));
  }
} 