package Blind75.Array;

public class BuyAndSellStockArray {
    public static void main(String[] args){

        //pending


        System.out.println("Buy And Sell Stock");

        int[] arr = {7,1,5,3,6,4};

        int buyStocks = arr[0];
        int maxProfit = 0;

        for(int i=1;i<arr.length;i++){
            if(buyStocks>arr[i]){
                buyStocks = arr[i];
            }
            else if(arr[i]-buyStocks>maxProfit){
                maxProfit = arr[i]-buyStocks;
            }
        }
        System.out.println("Max Profit"+maxProfit+"buy price "+buyStocks);
    }
}
