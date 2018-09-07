/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JOBSHEET3;
import java.util.Arrays;
/**
 *
 * @author Asus
 */
public class SelectionSort_Accending {

    public static void main(String[] args) {
        // TODO code application logic here
        SelectionSort_Accending obj = new SelectionSort_Accending();
         System.out.println("Dimas Afif Rehardendi / X RPL 6 / 18");
         int [] data = {8,3,6,1,4,2,9,10,15,11};
         System.out.println("Data Sebelum Di Sorting : " );
         System.out.println(Arrays.toString(data));
         SelectionSort_Accending(data);
    }
    public static void SelectionSort_Accending(int[] data){
        for(int x = 0; x < data.length; x++){
            int tampung = data[x];
            for(int y = x; y < data.length; y++){
                if(data[y] < data[x]){
                    data[x] = data[y];
                    data[y] = tampung;
                    tampung = data[x];
                }
            }
        }
        System.out.println();
         System.out.println("Data Sesudah Di Sorting : " );
         System.out.println(Arrays.toString(data));  
         
        
    }
    
}
