class Solution {
    public int maxSubArray(int[] nums) {
        int maximum_subarray = nums[0];
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            if(sum < 0){
                sum = 0;
            }
            sum += nums[i];
            maximum_subarray = Math.max(maximum_subarray, sum);
        }
        return maximum_subarray;
    }
}