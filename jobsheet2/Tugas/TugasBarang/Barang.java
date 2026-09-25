package jobsheet2.Tugas.TugasBarang;

public class Barang {
  String kode;
  String namaBarang;
  int hargaDasar;
  float diskon;

  int hitungHargaJual(){
    int hargaJual = Math.round(hargaDasar+(diskon*hargaDasar));
    return hargaJual;
  }

  void tampilData(){
    System.out.println("Kode: " + kode);
    System.out.println("Nama Barang: " + namaBarang);
    System.out.println("Harga Dasar: " + "Rp. " + hargaDasar);
    System.out.println("Diskon: " + (diskon*100) + "%");
  }
}
