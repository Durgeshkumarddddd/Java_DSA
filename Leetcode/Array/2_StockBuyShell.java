// In stock Buy and Shell the main goal is to find out maximum profit
// in given share prices arr
// profit = selling price - buy price ;

class StockBuyShell {
    public static int finalShellPrice(int[] stock){
        // 1. buyprice = infinite
        // 2. if(buyprice < selling)
        // 3. else buyprice = selling price

        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0 ;
        for (int i = 0 ; i < stock.length ; i++){
            if(buyprice < stock[i]){
              int currProfit = stock[i] - buyprice ;
              maxprofit = Math.max(maxprofit, currProfit);
            }
            else {
                buyprice = stock[i] ;
            }
        }
        return maxprofit ;
    }
    public static void main(String args[]){
        int []stock = {7,1,3,4,5,6,2};
       int maxprofit =  finalShellPrice(stock);
       System.out.println(maxprofit);
    }
}
