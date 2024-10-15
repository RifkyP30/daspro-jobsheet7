import java.util.Scanner;

public class TiketBioskop {
  public static void main(String[] args) {
    Scanner myInput = new Scanner(System.in);
    // Membuat variables
    int tiket, jmlPenjualanTiket = 0;
    double hargaTiket, diskon, totalHargaPenjualan = 0;
    char transaksiLagi = 'y';

    System.out.println("---- Program Menghitung Tiket Bioskop ----");

    while (transaksiLagi == 'y') {
      System.out.print("Masukkan jumlah tiket: ");
      tiket = myInput.nextInt();
      myInput.nextLine();

      if (tiket > 4 && tiket <= 10) {
        diskon = 0.1;
      }
      else if (tiket > 10) {
        diskon = 0.15;
      }
      else if (tiket > 0 && tiket <= 4) {
        diskon = 0;
      }
      else {
        System.out.println("Nilai tidak valid. Masukkan nilai yang valid!");
        continue;
      }
      // Menghitung diskon dan harga tiket
      hargaTiket = (1 - diskon) * (tiket * 50000);
      jmlPenjualanTiket += tiket;
      totalHargaPenjualan += hargaTiket;

      System.out.println("Harga tiket: " + hargaTiket);

      System.out.print("Ingin transaksi lagi? (y/n): ");
      transaksiLagi = myInput.nextLine().charAt(0);

    }

    // Menampilkan jumlah tiket dan total harga penjualan tiket dalam 1 hari
    System.out.println("---- Output ----");
    System.out.println("Total penjualan tiket: " + jmlPenjualanTiket);
    System.out.println("Total harga penjualan tiket: " + totalHargaPenjualan);

  }
}