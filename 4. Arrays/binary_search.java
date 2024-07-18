import java.util.*;

public class binary_search {
    public static int binarySearch(int arr[], int key){
        int start = 0;
        int end = arr.length - 1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid] == key){
                return mid;
            }
            if(arr[mid] < key){
                start = mid + 1;
            }
            if(arr[mid] > key){
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int numbers[] = {3, 5, 9, 10, 11, 15, 20, 34, 45, 56, 87, 99};
        int key = 55;

        int index = binarySearch(numbers, key);
        if(index == -1){
            System.out.println("NOT FOUND");
        } else{
            System.out.println("Key is at Index: "+ index);
        }
    }
}