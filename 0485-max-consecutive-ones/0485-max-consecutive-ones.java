class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int count = 0, maxx = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] == 1){
                count++;
            }
            if(nums[i] != 1){
                count = 0;
            }
            maxx = Math.max(maxx,count);
        }
        return maxx;
    }
}