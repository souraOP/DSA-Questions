class Solution {
    public int maxSubArray(int[] nums) {
        // brute approach
        // int maxSum = Integer.MIN_VALUE;
        // for(int i = 0; i < nums.length; i++) {
        //     for(int j = i; j < nums.length; j++) {
        //         int sum = 0;
        //         for(int z = i; z <= j; z++) {
        //             sum += nums[z];
        //         }
        //         maxSum = Math.max(maxSum, sum);
        //     }
        // }
        // return maxSum;
        
        // O(N^3)
        
        
        // better approach
        
//         for(int i = 0; i < nums.length; i++){
//             int sum = 0;
//             for(int j = i; j < nums.length; j++){
              
//                 sum += nums[j];
//                 maxSum = Math.max(maxSum, sum);
//             }
            
//         }
//         return maxSum;
        
        // O(N^2)
        
        
        // optimal approach
        int maxSum = nums[0];
        int sum = 0;
        for(int i =0; i < nums.length; i++) {
            if(sum < 0) {
                sum = 0;
            }
            sum += nums[i];
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
        
        
        
        
        
        
    }
}