package neetcode;

public class BuyAndSellStock {
    public int maxProfit(int[] prices) {
        int l = 0;
        int r = 1;
        int maxP = 0;
        int profit = 0;
        while(r < prices.length){
            if(prices[l] < prices[r]){
                profit = prices[r] - prices[l];
                maxP = Math.max(profit, maxP);
            }
            else {
                l = r;
            }
            r += 1;
        }
        return maxP;
    }
}
