import java.util.*;

public class reverse_array {
    public static void reverse(int arr[]){
        int first = 0, last = arr.length - 1;
        while(first < last){
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;

            first++;
            last--;
        }
    }

    public static void main(String args[]) {
        int numbers[] = {5, 16, 3, 8, 12};
        reverse(numbers);
        for(int i =0; i<numbers.length; i++){
            System.out.print(numbers[i]+" ");
        }
    }
}