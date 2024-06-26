class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE, index = 0;
        for(int i = 0; i < n; i++) {
            if(max < nums[i]) {
                max = nums[i];
                index = i;
            }
        } 
        return index;
    }
}