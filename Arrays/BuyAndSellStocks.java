package Arrays;

public class BuyAndSellStocks {
    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        int maxProfit=0;
        for(int i=0;i<arr.length;i++){
            int buyPrice=arr[i];
            for(int j=i+1;j<arr.length;j++){
                int sellPrice=arr[j];
                int profit=sellPrice-buyPrice;
                if(profit>maxProfit){
                    maxProfit=profit;
                }
            }
        }
        System.out.println("Max Profit is "+maxProfit);
    }
    
}
