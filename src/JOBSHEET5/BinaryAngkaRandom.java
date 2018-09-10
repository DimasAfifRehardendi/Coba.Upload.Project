package JOBSHEET5;

import javax.swing.JOptionPane;
import java.util.Random;

public class BinaryAngkaRandom {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Dimas Afif Rehardendi / X-RPL-6 / 18");
        int xim = Integer.parseInt(JOptionPane.showInputDialog("Masukan Jumlah Data : "));
        System.out.println("Masukan Jumlah Data : " + xim);
        System.out.println("==><====><====><==");

        int[] data = new int[xim];

        System.out.println("Data Inputan Random");

        for (int a = 0; a < xim; a++) {
            data[a] = new Random().nextInt(201);
        }
        System.out.println("\nMenampilkan Data :`");
        for (int a = 0; a < xim; a++) {
            System.out.println("Data ke- " + (a + 1) + " : " + data[a]);
        }
        int mencari1 = Integer.parseInt(JOptionPane.showInputDialog("Data yang Di Cari \nPertama"));
        System.out.println("\nMasukan Data yang Di Cari : \nPertama " + mencari1);

        int mencari2 = Integer.parseInt(JOptionPane.showInputDialog("Data yang Di Cari \nKedua  "));
        System.out.println("\nMasukan Data yang di Cari : \nKedua " + mencari2);

        boolean temu1 = false;
        boolean temu2 = false;
        int urutan1 = 0;
        int urutan2 = 0;

        for (int a = 0; a < xim; a++) {
            if (data[a] == mencari1) {
                urutan1 = a + 1;
                temu1 = true;
                break;
            }
        }
        for (int a = 0; a < xim; a++) {
            if (data[a] == mencari2) {
                urutan2 = a + 1;
                temu2 = true;
                break;
            }
        }
        if (temu1 == true) {
            System.out.println("\nData " + mencari1 + "\nDi Temukan Pada Urutan Ke- " + (urutan1));
        } else {
            System.out.println("\nData " + mencari1 + "\nTidak Di Temukan");
        }
        if (temu2 == true) {
            System.out.println("\nData " + mencari2 + "\nDi Temukan Pada Urutan Ke- " + (urutan2));
        } else {
            System.out.println("\nData " + mencari2 + "\nTidak Ditemukan ");
        }
    }

}
