package JOBSHEET4;
public class Merge_Sort {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("AKBAR BAIHAQI ILHAM");
        System.out.println("114117");
        System.out.println("*****SORTING*****");
        System.out.println();
        System.out.println("Merge Sorting");
        System.out.println();
        
        // Nomor yang akan di urut kan
        int n [] = {686, 840, 78, 508, 495, 456, 812, 475, 840, 225, 719, 14, 
            918, 157, 744, 514, 72, 632, 653, 837, 119, 996};
        System.out.println("Sebelum Di Urutkan");
        for(int i = 0; i < n.length; i++){
            System.out.print(n[i] + " ");
        }
        System.out.println();
        
       // Memanggil method initialiizemergesort
       initializemergesort(n, 0, n.length - 1);
       System.out.println();
       System.out.println("Setelah Di Urutkan");
       for(int i = 0; i < n.length; i++){
           System.out.print(n[i] + " ");
       }
    }

    private static void initializemergesort(int[] n, int i, int h) {
        int low = i; int high = h;
        if(low >= high){
            return;
        }
        int middle = (low + high) /2;
        initializemergesort(n, low, middle);
                initializemergesort(n, middle + i, high);
                int end_low = middle;
                int start_high = middle + i;
                while((i <= end_low ) && (start_high <= high)){
                    if(n[low] < n[start_high]){
                            low++;
                    }else {
                        int Temp = n[start_high];
                        for(int k = start_high - 1; k >= low; k--){
                            n[k + 1] = n[k];
                        }
                        n[low] = Temp;
                        low++;
                        end_low++;
                        start_high++;        
                    }
                }
    }

}
