class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        var count = 0;
        var maxOnes = 0;

        for(int n: nums) {
            if(n == 1) {
                count++;
                maxOnes = Math.max(count, maxOnes);
            } else {
                count = 0;
            }
        }
        return maxOnes;
    }
}