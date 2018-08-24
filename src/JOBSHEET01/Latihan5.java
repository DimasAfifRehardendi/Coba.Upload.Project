package JOBSHEET01;
import java.util.Scanner;
public class Latihan5 {
    public static int faktorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * faktorial(n - 1);
        }
    }
    public static void main(String[] args) {
        System.out.println("Dimas Afif Rehardendi/X RPL 6/18/JELEK >peace<");
        Scanner kms = new Scanner(System.in);
        System.out.println("Menghitung Faktorial Denagan Rekursif ");
        System.out.println();
        System.out.println("Masukan Bilangan");
        int jawab = kms.nextInt();
        int hasil = faktorial(jawab);
        System.out.println("Hasil : " + hasil);
    }
}
