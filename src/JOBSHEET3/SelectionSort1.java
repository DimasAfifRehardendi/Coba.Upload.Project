package JOBSHEET3;

import java.util.Scanner;

public class SelectionSort1 {

    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("Dimas Afif Rehardendi / X RPL 6 / 18");
        // BUAT OBJEC SCANNER
        Scanner in = new Scanner(System.in);

        //INPUT JUMLAH DATA
        System.out.println("Masukan Jumlah Data = ");
        int jlh_data = in.nextInt();

        // INPUT NILAI TIAP DATA
        int[] data = new int[jlh_data];
        // ARRAYS UNTU SETIAP DATA 
        System.out.println();
        for (int x = 0; x < jlh_data; x++) {
            System.out.println("Input Nilai Data ke - " + (x + 1) + " : ");
            data[x] = in.nextInt();
        }

        // MENAMPILKAN DATA SEBELUM DI SORTING
        System.out.println();
        System.out.println("Data Sebelum Di Sorting : ");
        for (int x = 0; x < jlh_data; x++) {
            System.out.print(data[x] + " ");
        }

        // PROSES SELECTION SORT
        System.out.println("\n\nProses Selection Sort");
        for (int x = 0; x < jlh_data - 1; x++) {
            System.out.println("Iterasi ke - " + (x + 1) + " ");
            for (int y = 0; y < jlh_data - 1; y++) {
                System.out.print(data[y] + " ");
            }

            System.out.println("Apakah Data " + data[x] + " Sudah Benar Pada Urutanya ?");
            boolean tukar = false;
            int index = 0;
            int min = data[x];
            String pesan = "Tidak Ada Pertukaran";
            for (int y = x + 1; y < jlh_data; y++) {
                if (min > data[y]) {
                    tukar = true;
                    index = y;
                    min = data[y];
                }
            }
            if (tukar == true) {

                // PERTUKARAN DATA
                pesan = "Data " + data[x] + "Ditukar Dengan Data" + data[index];
                int temp = data[x];
                data[x] = data[index];
                data[index] = temp;
            }

            for (int y = 0; y < jlh_data; y++) {
                System.out.print(data[y] + " ");
            }
            System.out.println(pesan + "\n");
        }

        // TAMPILKAN DATA HASIL DI SORTING
        System.out.println("\n\nProses Setelah Di Sorting");
        for (int x = 0; x < jlh_data; x++) {
            System.out.print(data[x] + " ");
           
        }

    }
}
