import java.util.*;

public class selection_sort {
    public static void selectionSort(int arr[]){
        int minPos, temp = 0;
        for(int i=0; i<arr.length - 1; i++){
            minPos = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] < arr[minPos]){
                    minPos = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[minPos];
            arr[minPos] = temp;
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
        selectionSort(numbers);
        printArr(numbers);
    }
}