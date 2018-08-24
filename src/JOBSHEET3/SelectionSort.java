package JOBSHEET3;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Dimas Afif Rehardendi / X RPL 6 / 18");
        int[] angka = {8, 3, 4, 7, 2, 6, 5, 1, 10, 9};
        System.out.println("-- Awal--");
        System.out.println(Arrays.toString(angka));
        Selection_Short(angka);

    }

    public static void Selection_Short(int[] angka) {
        for (int i = 0; i < angka.length; i++) {
            int tampung = angka[i];
            for (int j = i; j < angka.length; j++) {
                if (angka[j] < angka[i]) {
                    angka[i] = angka[j];
                    angka[j] = tampung;
                    tampung = angka[i];
                }
            }
        }
        System.out.println("-- Hasil --");
        System.out.println(Arrays.toString(angka));
        System.out.println();
    }

}
