/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JOBSHEET4;

public class Mergesort1 {
    private int[] data;
    
// Konstruktor
    public Mergesort1(int n) {
        this.data = new int[n];
    }
    
// Method Set Data
    public void SetData(int index, int value) {
        if (index >= 0 && index < this.data.length) {
            this.data[index] = value;
        }
    }
    
// Method Print Data
    public void PrintData() {
        String out = "Data=";
        for (int a = 0; a < this.data.length; a++) {
            out += this.data[a] + ",";
        }
        System.out.println(out);
    }
    
// Method Merge Sort
public void Sort() {
// Tentukan posisi awal dan akhir
        int i = 0;
        int j = this.data.length - 1;
// Urutkan
        MergeSort(i, j);
    }

    private void MergeSort(int start, int end) {
// Tentukan jumlah data
        int n = (end - start + 1);
        if (n > 1) {
// Hitung nilai tengah
            int mid = (start + end) / 2;
// Rekursif MergeSort
            MergeSort(start, mid);
            MergeSort(mid + 1, end);
// Merge
            int[] temp = new int[n];
            int x = start;
            int y = mid + 1;
            for (int a = 0; a < n; a++) {
                if (x <= mid && y <= end) {
                    if (this.data[x] < this.data[y]) {
                        temp[a] = this.data[x];
                        x++;
                    } else {
                        temp[a] = this.data[y];
                        y++;
                    }
                } else if (x <= mid) {
                    temp[a] = this.data[x];
                    x++;
                } else {
                    temp[a] = this.data[y];
                    y++;
                }
            }
// Salin hasil pengurutan
            for (int a = 0; a < n; a++) {
                this.data[start + a] = temp[a];
            }
        }
    }

public static void main(String[] args) {
// Buat objek
        Mergesort1 mergesort = new Mergesort1(10);
// Input isi
        mergesort.SetData(0, 119);
        mergesort.SetData(1, 122);
        mergesort.SetData(2, 114);
        mergesort.SetData(3, 118);
        mergesort.SetData(4, 120);
        mergesort.SetData(5, 117);
        mergesort.SetData(6, 115);
        mergesort.SetData(7, 112);
        mergesort.SetData(8, 121);
        mergesort.SetData(9, 116);
        mergesort.SetData(10,113);
// Print
        mergesort.PrintData();
// Sort
        mergesort.Sort();
// Print
        mergesort.PrintData();
    }
}
