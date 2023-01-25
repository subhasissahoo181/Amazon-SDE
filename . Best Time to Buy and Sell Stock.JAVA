class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        int minprice = Integer.MAX_VALUE;

        for(int i=0; i<prices.length; i++){
            if(prices[i] < minprice){
                minprice=prices[i];
            }
            if(maxprofit < prices[i]-minprice){
                maxprofit = prices[i]-minprice;
            }
        } 
        return maxprofit;
    }
}