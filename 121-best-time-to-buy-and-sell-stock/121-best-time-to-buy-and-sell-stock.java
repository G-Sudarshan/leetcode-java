class Solution {
    public int maxProfit(int[] prices) {
        
        int buy = prices[0];
        int max_profit = Integer.MIN_VALUE;
        
        for(int price: prices){
            buy = Math.min(buy, price);
            max_profit = Math.max(max_profit, price-buy);
        }
       
        return max_profit;
    }
}