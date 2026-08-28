class Solution {
    public int maxProfit(int[] prices) {
     int profit = 0;
     for(int k=0;k<prices.length-1;k++){
        for(int i=k+1;i<prices.length;i++){
            if(prices[k]<prices[i])
                profit = Math.max(profit, prices[i]-prices[k]);
        }
     }
    return profit;
    }
}
