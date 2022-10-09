class Solution {
    public int maxProfit(int[] prices) {
        int final_price = 0;
        int priceLength = prices.length;
        int minimumPrice = prices[0];
        for(int i = 1; i < priceLength; i++){
            minimumPrice = Math.min(minimumPrice, prices[i]);
            final_price = Math.max(final_price, prices[i] - minimumPrice);
        }
        return final_price;
    }
}