class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c = 0, maxx = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 1) {
                c++;
            }
            if(nums[i] != 1) {
                c = 0;
            }
            maxx = Math.max(maxx, c);
        }
        
        return maxx;
    }
}