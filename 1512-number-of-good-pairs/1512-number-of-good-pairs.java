class Solution {
    public int numIdenticalPairs(int[] nums) {
        int c = 0;
        int[] count = new int[101];
        for(int i: nums){
            c = count[i]++ + c;
        }
        
        return c;
    }
}