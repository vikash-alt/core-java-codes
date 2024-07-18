import java.util.*;

public class diagonal_sum {
    // //burteforce TC = n^2
    // public static int diagonalSum(int arr[][]){
    //     int sum = 0;
    //     for(int i = 0; i<arr.length; i++){
    //         for(int j=0; j<arr[0].length; j++){
    //             if(i == j){
    //                 sum += arr[i][j];
    //             }
    //             else if((i+j) == (arr.length -1)){
    //                 sum += arr[i][j];
    //             }
    //         }
    //     }
    //     return sum;
    // }
    
    // optimized TC = n
    public static int diagonalSum(int arr[][]){
        int sum = 0;
        for(int i =0; i<arr.length; i++){
            sum += arr[i][i];

            if(i != arr.length - 1 - i)
                sum += arr[i][arr.length - 1 - i];
        }
        return sum;
    }

    public static void main(String args[]) {
        int matrix[][] = {{1, 2, 3},
                          {5, 6, 7},
                          {9, 10, 11}};

        int sum = diagonalSum(matrix);                  

        System.out.println("The diagonal sum is: "+sum);
    }
}