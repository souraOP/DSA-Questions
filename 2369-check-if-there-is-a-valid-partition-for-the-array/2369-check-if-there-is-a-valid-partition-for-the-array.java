class Solution {
    public boolean validPartition(int[] nums) {
        boolean[] isValid = new boolean[nums.length];
        if(nums[1] == nums[0]){
            isValid[1] = true;
        }
        
        if (nums.length == 2) return isValid[1];
        if(nums[0] == nums[1] && nums[2] == nums[1]){
            isValid[2] = true;
        }
        if(nums[1] == nums[0]+1 && nums[2] == nums[1]+1){
            isValid[2] = true;
        }
        if(nums.length == 3) {
            return isValid[2];
        }
        
        for(int i = 3; i < nums.length; i++){
            if(nums[i]==nums[i-1] && isValid[i-2]) isValid[i] = true;
            if(nums[i]==nums[i-1] && nums[i-1]==nums[i-2] && isValid[i-3]) isValid[i] = true;
            if(nums[i]==nums[i-1]+1 && nums[i-1]==nums[i-2]+1 && isValid[i-3]) isValid[i] = true;
        }
        return isValid[nums.length - 1];
    }
}