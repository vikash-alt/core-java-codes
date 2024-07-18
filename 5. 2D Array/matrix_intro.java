import java.util.*;

public class matrix_intro { 

    public static void serachMatrix(int matrix[][], int key){
        for(int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == key){
                    System.out.println("Key found at ("+i+","+j+")");
                }
            }
        }
        System.out.println("Key Not found.");
    }

    public static void main(String args[]) {
        int matrix[][] = new int[3][4];
        int m = matrix.length, n = matrix[0].length;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the matrix values.");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.print("Enter the key to find: ");
        int key = sc.nextInt();
        serachMatrix(matrix, key);    
    }
}