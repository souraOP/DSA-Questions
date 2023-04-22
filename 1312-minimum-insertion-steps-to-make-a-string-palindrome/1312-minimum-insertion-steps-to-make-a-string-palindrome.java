class Solution {
    public int minInsertions(String s) {
        StringBuilder x = new StringBuilder(s);
        x.reverse();
        String xt = x.toString();
        int n = s.length();
        
        int[][] arr = new int[n+1][n+1];
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(s.charAt(i-1) == x.charAt(j-1)){
                    arr[i][j] = 1 + arr[i-1][j-1];
                } else {
                    arr[i][j] = Math.max(arr[i-1][j], arr[i][j-1]);
                }
            }
        }
        return n - arr[n][n];
    }
}