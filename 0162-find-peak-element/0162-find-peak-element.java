class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        if(n == 1) return 0;
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