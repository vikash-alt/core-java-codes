import java.util.*;

public class inbuilt_sort {

    public static void printArr(Integer arr[]){ 
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    // // for sorting the whole array
    // public static void main(String args[]) {
    //     int numbers[] = {9, 5, 7, 4, 1, 3, 2, 6};

    //     Arrays.sort(numbers);

    //     printArr(numbers);
    // }

    // // for sorting a specific part of the array
    // public static void main(String args[]) {
    //     int numbers[] = {9, 5, 7, 4, 1, 3, 2, 6};

    //     Arrays.sort(numbers, 0, 5);

    //     printArr(numbers);
    // }
    // // for descending or reverse order sorting
    // public static void main(String args[]) {
    //     Integer numbers[] = {9, 5, 7, 4, 1, 3, 2, 6};

    //     Arrays.sort(numbers, Collections.reverseOrder());

    //     printArr(numbers);
    // }
    // //for a range 
    // public static void main(String args[]) {
    //     Integer numbers[] = {9, 5, 7, 4, 1, 3, 2, 6};

    //     Arrays.sort(numbers, 0, 4, Collections.reverseOrder());

    //     printArr(numbers);
    // }
}