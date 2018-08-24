/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JOBSHEET01;

/**
 *
 * @author Asus
 */
public class Rekursi {
    static String [] mahasiswa = {"Andri", "Dimas", "Kiki",};
    public static void main(String[] args) {
       getmahasiswa(0);
    }
    static void getmahasiswa(int absensi){
        if(absensi < mahasiswa.length){
            System.out.println("Absensi No- " + (absensi+1) + " Bernama : " + mahasiswa[absensi]);
            getmahasiswa(++absensi);
        }
    }
}
