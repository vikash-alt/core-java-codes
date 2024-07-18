import java.util.*;

public class staircase_search_matrix {
    public static boolean starecseSearch(int arr[][], int key){
        int i = 0, j = arr[0].length - 1;
        while((i<=arr.length-1) && (j>=0)){
            if(arr[i][j] == key){
                System.out.println("Key found at index ("+i+","+j+")");
                return true;
            }
            else if(arr[i][j] > key){
                j--;
            }
            else if(arr[i][j] < key){
                i++;
            }
        }
        System.out.println("Key not found!");
        return false;
    }

    public static void main(String args[]) {
        int matrix[][] = {{10, 20, 30, 40},
                          {15, 25, 35, 45},
                          {27, 29, 37, 48},
                          {32, 33, 39, 50}};
        int key = 29;
        
        starecseSearch(matrix, key);
    }
}