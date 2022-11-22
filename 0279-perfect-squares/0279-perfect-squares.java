class Solution {
    public int numSquares(int n) {
        int[] perfectSquare = new int[n+1];
        for(int i=0; i<=n; i++){
            perfectSquare[i] = i;
            for(int j=1;j*j<=i;j++){
                perfectSquare[i] = Math.min(perfectSquare[i-j*j]+1, perfectSquare[i]);
            }
        }
        return perfectSquare[n];
    }
}