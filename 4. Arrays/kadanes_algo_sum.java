// this algo is not for array containg all the negative numbers

import java.util.*;

public class kadanes_algo_sum {
    public static int kadanes(int arr[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for(int i=0; i<arr.length; i++){
            cs = cs + arr[i];
            if(cs < 0){
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        return ms;
    }

    public static void main(String args[]) {
        int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        int max = kadanes(numbers);
        System.out.println("Max sum = "+max);
    }
}