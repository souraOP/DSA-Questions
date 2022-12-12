class Solution {
    public int climbStairs(int n) {
        if(n == 0 || n == 1 || n == 2) return n;
        int[] souraOP = new int[n];
        souraOP[0] = 1;
        souraOP[1] = 2;
        for(int i = 2; i < n; i++){
            souraOP[i] = souraOP[i - 1] + souraOP[i - 2];
        }
        return souraOP[n -1];
    }
}