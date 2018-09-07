package JOBSHEET6;
import java.math.BigInteger;
import java.util.Scanner;
public class Dynamic_Programing {

    private static void tampilJudul(String identitas) {
        System.out.println("identitas " + identitas);
        System.out.println("\nHitung Fibbonaci");
        System.out.println("1, 1, 2, 3, 5, 8, 13, 21....dts\n");
    }
    private static int tampilInput(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Bilangan ke-: ");
        int n = scan.nextInt();
        
        return n;
    }
    
    private static BigInteger fibo(int n){
        BigInteger[] hasil = new BigInteger[n];
        
       hasil[0] = BigInteger.ONE;
       hasil[1] = BigInteger.ONE;
       
       for(int i = 1; i < n; i++){
           hasil[i] = hasil [i-1].add(hasil[i-1]);
       }
       return hasil[n-1];
    }
    private static void tampilHasil(int n, BigInteger hasil){
        System.out.println("Bilangan Fibonacci Ke- " + n + " : " + hasil);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        String identitas = "Dimas Afif Rehardendi / X RPL 6 / 18";
//        System.out.println(identitas);
        tampilJudul(identitas);
        int n = tampilInput();
        BigInteger hasil = fibo(n);
        tampilHasil(n, hasil);

    }
}
