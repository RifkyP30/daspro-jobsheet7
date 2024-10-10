import java.util.Scanner;

public class SiakadFor15 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double nilai, tertinggi, terendah, nilaiMinimal;
    byte jmlLulus = 0, jmlTdkLulus = 0;
    tertinggi = 0;
    terendah = 100;
    nilaiMinimal = 60;

    for (int i = 1; i <= 10; i++) {
      System.out.print("Masukkan nilai mahasiswa ke " + i + ": ");
      nilai = sc.nextDouble();
      if (nilai > tertinggi) {
        tertinggi = nilai;
      }
      if (nilai < terendah) {
        terendah = nilai;
      }
      if (nilai >= nilaiMinimal) {
        jmlLulus++;
      }
      else {
        jmlTdkLulus++;
      }
    }

    System.out.println("Nilai tertinggi: " + tertinggi);
    System.out.println("Nilai terendah: " + terendah);
    System.out.println("Jumlah mahasiswa yang lulus: " + jmlLulus);
    System.out.println("Jumlah mahasiswa yang tidak lulus: " + jmlTdkLulus);
  }
}