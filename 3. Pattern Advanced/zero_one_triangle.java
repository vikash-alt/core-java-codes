import java.util.*;

public class zero_one_triangle {
    public static void zeroOneTriangle(int n){
        for(int i = 1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                if((i+j)%2==0){
                    System.out.print("1");
                } else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        zeroOneTriangle(5);
    }
}