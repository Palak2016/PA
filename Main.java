import java.util.*;

// sliding window

class Main{
    public static int maxSum(int[] arr,int k){
        int windowSum=0;
        for(int i=0;i<k;i++){
            windowSum += arr[i];
        }
        int maxSum=windowSum;
        for(int i=k; i<arr.length;i++){
            windowSum+=arr[i];
            windowSum-=arr[i-k];
            maxSum=Math.max(maxSum,windowSum);
        }
        return maxSum;
        
    }
    public static void main(String[] args){
        int[] arr = {1,2,4,3,9,11};
        int k=3;
        System.out.print(maxSum(arr,k));
    }
}
