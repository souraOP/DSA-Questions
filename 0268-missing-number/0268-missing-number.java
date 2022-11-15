class Solution {
    public int missingNumber(int[] nums) {
        int xc = 0, j = 0;
        for(; j< nums.length; j++){
            xc = xc + j - nums[j];
        }
        return (xc+j);
    }
}