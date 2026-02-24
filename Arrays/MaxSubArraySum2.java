package Arrays;

public class MaxSubArraySum2 {
    public static void maxSubarraySumPrefix(int arr []){
        int maxSum=Integer.MIN_VALUE;
        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                int sum=start==0?prefix[end]:prefix[end]-prefix[start-1];
                if(sum>maxSum){
                    maxSum=sum;
                }
            }
        }
        System.out.println("Max Sub Array Sum is "+maxSum);
    }

    
}
