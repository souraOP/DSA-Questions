class Solution {
    public int countOdds(int low, int high) {
        int oddIntervals = (high - low)/2;
        if(low % 2 == 1 || high % 2 == 1){
            oddIntervals++;
        }
        return oddIntervals;
    }
}