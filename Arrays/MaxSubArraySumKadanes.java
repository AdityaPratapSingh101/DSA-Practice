package Arrays;

public class MaxSubArraySumKadanes {
    public static void maxSubArraySumKadanes(int arr []){
        int maxSum=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum>maxSum){
                maxSum=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        System.out.println("Max Sub Array Sum is "+maxSum);
    }
    
}
