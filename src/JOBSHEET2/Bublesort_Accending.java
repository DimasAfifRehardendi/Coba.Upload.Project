package JOBSHEET2;

import java.util.Arrays;

public class Bublesort_Accending {

    public static void main(String[] args) {
        System.out.println("Dimas Afif Rehardendi / X RPL 6 / 18");
        //	Variable
        int[] bilangan = {50, 5, 44, 100, 76};

        //	Tampilkan bilangan
        System.out.println("\nBilangan sebelum di sorting Bubble Sort : " + Arrays.toString(bilangan));

        //	Proses Bubble Sort
        System.out.println("\nProses Bubble Sort secara Ascending:");
        // untuk mengeluarkan iterasi ke berapa
        for (int a = 0; a < bilangan.length; a++) {
            //	Tampilkan proses Iterasi
            System.out.println("Iterasi " + (a + 1));
            // untuk menghilangkan barisan hasil / jika b = 0 dan b lebih kecil dari elemen
            for (int b = 0; b < bilangan.length-1; b++) {
                if (bilangan[b] > bilangan[b + 1]) {
                    //	proses pertukaran bilangan / swap
                    int temp = bilangan[b];
                    bilangan[b] = bilangan[b + 1];
                    bilangan[b + 1] = temp;
                }

                //	Tampilkan proses pertukaran tiap iterasi
                System.out.println(Arrays.toString(bilangan));
            }
            System.out.println();
        }

        //	Tampilkan hasil akhir
        System.out.println("Hasil akhir setelah di sorting: " + Arrays.toString(bilangan));
    }
}
