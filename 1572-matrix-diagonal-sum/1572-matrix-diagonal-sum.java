class Solution {
    public int diagonalSum(int[][] mat) {
        int x = mat.length;
        int ans = 0;
        for(int i = 0; i < x; i++){
            ans += mat[i][i];
            if(i != x-i-1){
                ans+=mat[i][x-i-1];
            } 
        }
        return ans;
        
    }
}