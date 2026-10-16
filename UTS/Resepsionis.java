public class Resepsionis {
  private String nama;
  public Resepsionis(String nama) {
    this.nama = nama;
  }

  public void cetakInvoice(Kamar kamar){
    System.out.println("Invoice Kamar "+kamar.getNomor()+" ("+kamar.getTipe() + ") - " + kamar.getReservasi().kode + " - " + kamar.getReservasi().getTamu().getNama() + "[" + kamar.getReservasi().getJenis() + "]" +" - " + kamar.getReservasi().jumlahMalam + " malam : " + kamar.getReservasi().hitungTotal(kamar.getTarif()));
  }
}
