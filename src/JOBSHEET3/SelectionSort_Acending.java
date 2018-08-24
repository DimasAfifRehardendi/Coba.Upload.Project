package JOBSHEET3;

import java.util.Arrays;

public class SelectionSort_Acending {

    public static void main(String[] args) {
        // TODO code application logic here
        
        SelectionSort_Acending ob = new SelectionSort_Acending();
        int arr[] = {8, 3, 6, 1, 4, 2, 9, 10, 15, 11};
        System.out.println("Sebelum disorting : \n" + Arrays.toString(arr));
        System.out.println();
        ob.sort(arr);
        System.out.println();
        System.out.println("Setelah disorting : \n" + Arrays.toString(arr));
    }

    public static void sort(int arr[]) {
        int n = arr.length;
        System.out.println("Proses Iterasi : ");
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            System.out.println("Iterasi ke-" + (i + 1) + ":");
            System.out.println(Arrays.toString(arr));
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
}
