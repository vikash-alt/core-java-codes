import java.util.*;

public class print_subarrays {
    public static void printSubarrays(int arr[]){
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                for(int k=i; k<=j; k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int a[] = {2, 4, 6, 8, 10};
        printSubarrays(a);
    }
}