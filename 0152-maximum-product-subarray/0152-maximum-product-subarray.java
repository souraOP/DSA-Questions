class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int anss = nums[0];
        for(int i = 0; i < n; i++){
            int prod = nums[i];
            for(int j= i +1; j < n; j++) {
                anss = Math.max(anss, prod);
                prod *= nums[j];
            }
            anss = Math.max(anss, prod);

        }
        return anss;
    }
}