import java.util.Scanner;

public class TarifParkir {
  public static void main(String[] args) {
    Scanner myInput = new Scanner(System.in);
    // Membuat variables
    byte jenisKendaraan, durasi;
    int tarifParkir;

    System.out.println("---- Program Tarif Parkir ----");
    System.out.println("[1] Mobil");
    System.out.println("[2] Motor");
    System.out.println("[0] Keluar dari program");

    do {
      System.out.print("Masukkan jenis kendaraan: ");
      jenisKendaraan = myInput.nextByte();

      if (jenisKendaraan == 1 || jenisKendaraan == 2) {
        System.out.print("Masukkan durasi parkir: ");
        durasi = myInput.nextByte();

        if (durasi > 5) {
          tarifParkir = 12500;
        }
        else {
          if (jenisKendaraan == 1) {
            tarifParkir = durasi * 3000;
          }
          else {
            tarifParkir = durasi * 2000;
          }
        }

        // Menampilkan output tarif parkir
        System.out.println("Tarif parkir: " + tarifParkir);
      }
      else if (jenisKendaraan != 0) {
        System.out.println("Nilai tidak valid. Masukkan nilai yang valid!");
        continue;
      }
    }
    while (jenisKendaraan != 0); 
  }
}