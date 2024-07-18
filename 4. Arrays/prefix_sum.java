import java.util.*;

public class prefix_sum {
    public static int prefixSum(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for(int i=1; i<arr.length; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                currSum = 0;

                if(i == 0){
                    currSum = prefix[j];
                } else{
                    currSum = prefix[j] - prefix[i-1];
                }
                
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        return maxSum;
    }

    public static void main(String args[]) {
        int numbers[] = {1,-2,6,-1,3};
        int max = prefixSum(numbers);
        System.out.println("Maximum sum is: "+max);
    }
}