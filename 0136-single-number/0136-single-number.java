class Solution {
    public int singleNumber(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            int c = 0;
            // store the element
            int z = nums[i];
            
            // apply linear search
            for(int j = 0; j < nums.length; j++) {
                if(nums[j] == z){
                    c++;
                }
            }
            if(c == 1) return z;
        }
        return -1;
    }
}