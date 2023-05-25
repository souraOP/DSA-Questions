class Solution {
    public double new21Game(int n, int k, int w) {
        
        if(n >= k + w || k == 0 ) return 1.0 ;
        
        double[] dp = new double[n+1];
        dp[0] = 1.0;

        double res = 0.0;
        double runningSum = dp[0];

        for(int i=1; i<=n; i++) {
            
            // at this point, i assume that i have with me the sum of the previous w elements
            dp[i] = (runningSum * 1.0) / (w);
            
            // if the element we are trying to add is less than k, only then we will add
            if(i < k) {
                runningSum+=dp[i];
            } else {
                // in case the current i is greater than k we will add it to our answer because at the end we need the sum of dp values from k to n
                res+=dp[i];
            }

            if(i - w >= 0) {
                // adjust the tail end
                runningSum-=dp[i-w];
            }
            
        }

        return res;
    }
}