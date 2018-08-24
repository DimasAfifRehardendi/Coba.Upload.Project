package JOBSHEET01;

import java.util.Scanner;

public class Rekursif1 {

  
    public static void cetak (int i){
        if(i > 0){
            System.out.print("Hai ");
            cetak(--i);
        }
    }
    public static void main(String[] args) {
        System.out.println("Dimas Afif Rehardendi/X RPL 6/18");
        Scanner masuk = new Scanner(System.in);
        System.out.print("Masukan jumlah teks yang ingin di cetak");
        int jumlah = masuk.nextInt();
        cetak(jumlah);
    }

}
