import java.util.*;

public class intertion_sort {
    public static void intertionSort(int arr[]){
        for(int i = 1; i<arr.length; i++){
            int temp = arr[i];
            int j = i;
            while(j>0 && arr[j-1]>temp){
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = temp;
        }
    }

    public static void printArr(int arr[]){ 
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int numbers[] = {9, 5, 7, 4, 1, 3, 2, 6};
        intertionSort(numbers);
        printArr(numbers);
    }
}