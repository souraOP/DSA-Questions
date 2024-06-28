class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1, high = findMax(piles);
        while(low <= high) {
            int mid = low + (high - low) / 2;
            int totalHours = calculateTotalHours(piles, mid);
            if(totalHours <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
    
    public static int findMax(int[] v){
        int max_val = Integer.MIN_VALUE;
        int n = v.length;
        for(int i = 0; i < n; i++) {
            max_val = Math.max(max_val, v[i]);
        }
        return max_val;
    }
    
    public static int calculateTotalHours(int[] v, int h){
        int totalHours= 0;
        int n= v.length;
        for (int i = 0; i < n; i++) {
            totalHours += Math.ceil((double)(v[i]) / (double)(h));
        }
        return totalHours;
    }
}