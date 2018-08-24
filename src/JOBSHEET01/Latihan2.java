package JOBSHEET01;
public class Latihan2 {
    public static void cetak(int i){
        if(i > 0){
            System.out.println("SMK Telkom Malang");
            cetak(--i);
        }
    }
    public static void main(String[] args) {
        // MENCETAK KATA STRING YANG DI DALAM TANDA KURUNG PETIK SEBANYAK 5 KALI
         System.out.println("Dimas Afif Rehardendi/X RPL 6/18");
        cetak(5);
    }
}
