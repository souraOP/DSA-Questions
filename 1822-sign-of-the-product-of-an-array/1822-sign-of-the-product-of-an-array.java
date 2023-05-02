class Solution {
    public int arraySign(int[] nums) {
        int product = 1;
        for(int i: nums){
            product *= Math.signum(i);
        }
        return product;
    }
}