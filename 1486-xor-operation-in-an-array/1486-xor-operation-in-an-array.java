class Solution {
    public int xorOperation(int n, int start) {
        int nums = 0;
        for(int i = 0; i < n; i++){
            nums = nums ^ (start + 2 * i);
        }
        return nums;
    }
}