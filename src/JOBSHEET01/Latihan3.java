package JOBSHEET01;
import java.util.Scanner;
public class Latihan3 {
    public static void cetakAngka(int angka) {
        System.out.print(angka + "");
        cetakAngka(--angka);
        if (angka >= 1) {
            System.out.print(angka + "");
            cetakAngka(--angka);
        }
    }
    public static void main(String[] args) {
         System.out.println("Dimas Afif Rehardendi/X RPL 6/18");
        Scanner masuk = new Scanner(System.in);
        System.out.print("Masukan Angka");
        int N = masuk.nextInt();
        cetakAngka(N);
    }
}
