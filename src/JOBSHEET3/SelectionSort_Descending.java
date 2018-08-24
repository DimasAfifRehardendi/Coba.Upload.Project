package JOBSHEET3;

import java.util.Arrays;

public class SelectionSort_Descending {

    public static void main(String[] args) {
        // TODO code application logic here
        int Arr[] = new int[]{8, 3, 6, 1, 4, 2, 9, 10, 15, 11};
        SelectionSort_Descending ob = new SelectionSort_Descending();
        System.out.println("Sebelum disorting : \n" + Arrays.toString(Arr));
        System.out.println();
        ob.proses(Arr);
        System.out.println();
        System.out.println("Sesudah disorting : \n" + Arrays.toString(Arr));
    }

    public static void proses(int Arr[]) {
        int n = Arr.length;
        System.out.println("Proses Iterasi : ");
        for (int i = 0; i < n - 1; i++) {
            int max_idx = i;
            System.out.println("Iterasi ke-" + (i + 1) + ":");
            System.out.println(Arrays.toString(Arr));

            for (int j = i + 1; j < n; j++) {
                if (Arr[j] > Arr[max_idx]) {
                    max_idx = j;
                }

            }
            int temp = Arr[max_idx];
            Arr[max_idx] = Arr[i];
            Arr[i] = temp;

        }
    }
}
