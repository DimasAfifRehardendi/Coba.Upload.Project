package JOBSHEET2;

import java.util.Arrays;

public class Bublesort_Descending {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Dimas Afif Rehardendi / X RPL 6 / 18");
        //	Variable
        int[] bilangan = {5, 12, 3, 19, 1, 47};

        //	Tampilkan bilangan  
        System.out.println("Bilangan sebelum di sorting Bubble Sort : " + Arrays.toString(bilangan));

        //	Proses Bubble Sort
        System.out.println("\nProses Bubble Sort secara Descending:");
        for (int a = 0; a < bilangan.length; a++) {
            //	Tampilkan proses Iterasi
            System.out.println("Iterasi " + (a + 1));
            for (int b = 0; b < bilangan.length - 1; b++) {
                if (bilangan[b] < bilangan[b + 1]) {
                    //	proses pertukaran bilangan
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
