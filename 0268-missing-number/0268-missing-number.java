class Solution {
    public int missingNumber(int[] nums) {
        int xy = nums.length;
        int sss = (xy*(xy+1))/2;
        int curr = 0;
        for(int i = 0; i< xy; i++){
            curr += nums[i];
        }
        return sss - curr;
    }
}