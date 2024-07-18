// bruteforce technique

import java.util.*;

public class max_Subarray_Sum {
    public static int maxSubarraySum(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                currSum = 0;
                for(int k=i; k<=j; k++){
                    currSum+=arr[k];
                }
                System.out.println(currSum);
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        return maxSum;
    }

    public static void main(String args[]) {
        int numbers[] = {1,-2,6,-1,3};
        int max = maxSubarraySum(numbers);
        System.out.println("Maximum sum is: "+max);
    }
}