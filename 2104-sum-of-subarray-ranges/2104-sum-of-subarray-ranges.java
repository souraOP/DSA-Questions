class Solution {
    public long subArrayRanges(int[] arr) {
        int n = arr.length;
        long ans=0;
        for(int i = 0; i < n; i++) {
            long getMin = arr[i];
            long getMax = arr[i];
            long getRange = 0;
            for(int j = i+1; j <= n-1; j++){
                getMin = Math.min(getMin, arr[j]);
                getMax = Math.max(getMax, arr[j]);
                getRange = getMax - getMin;
                ans += getRange;
            }
        }
        return ans;
    }
}