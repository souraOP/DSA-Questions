class Solution {
    public int maxProfit(int[] prices) {
        // brute approach : O(N^2)
        // int maxSum = 0;
        // for(int i = 0; i < prices.length - 1; i++) {
        //     for(int j = i + 1; i < prices.length; j++) {
        //         if(prices[j] > prices[i]) {
        //             maxSum = Math.max(prices[j] - prices[i], maxSum);
        //         }
        //     }
        // }
        // return maxSum;
        
        // optimal approach: O(N)
        int maxSum = 0, minSum = prices[0];
        for(int i = 1; i < prices.length; i++){
            minSum = Math.min(minSum, prices[i]);
            maxSum = Math.max(maxSum, prices[i] - minSum);
        }
        return maxSum;
        
    }
}