import java.util.Scanner;

public class TestLogistik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Kontainer kontainerAlfa = new Kontainer("REQ-9988", "PT. Maju Bersama", 5000);
        
        System.out.println("Nama Pemilik Kontainer: " + kontainerAlfa.getNamaPemilik());
        System.out.println("Kapasitas Maksimal: " + kontainerAlfa.getKapasitasMaksimal() + " kg");
        
        // Input Tambah Muatan 1
        System.out.print("\nMasukkan muatan baru (kg): ");
        double inputTambah1 = sc.nextDouble();
        System.out.println("Memasukkan muatan baru seberat " + inputTambah1 + " kg...");
        kontainerAlfa.tambahMuatan(inputTambah1);
        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");
        
        // Input Tambah Muatan 2
        System.out.print("\nMasukkan muatan baru (kg): ");
        double inputTambah2 = sc.nextDouble();
        System.out.println("Memasukkan muatan baru seberat " + inputTambah2 + " kg...");
        kontainerAlfa.tambahMuatan(inputTambah2);
        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");

        // Input Turunkan Muatan
        System.out.print("\nMasukkan muatan yang ingin dibongkar (kg): ");
        double inputTurun1 = sc.nextDouble();
        System.out.println("Membongkar muat/menurunkan barang seberat " + inputTurun1 + " kg...");
        kontainerAlfa.turunkanMuatan(inputTurun1);
        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");
        
        sc.close();
    }
}