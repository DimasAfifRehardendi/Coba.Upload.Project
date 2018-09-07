package JOBSHEET6;
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
        
        return 0;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        String identitas = "Dimas Afif Rehardendi / X RPL 6 / 18";
//        System.out.println(identitas);
        tampilJudul(identitas);
        int n = tampilInput();

    }
}
