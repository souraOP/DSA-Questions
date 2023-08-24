class Solution {
    public void moveZeroes(int[] nums) {
        int count = 0;   //taking count of the number of zeros in nums[]
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                count++;
            } else if(count > 0){
                int j = nums[i];
                nums[i] = 0;
                nums[i - count] = j;
            }
        }
        
    }
}