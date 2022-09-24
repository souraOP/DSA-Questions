class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0, i, j;
        char[] J = jewels.toCharArray();
        char[] S = stones.toCharArray();
        for (i = 0; i <= S.length-1; i++){
            for(j = 0; j <= J.length-1; j++){
                if(J[j] == S[i]){
                    count++;
                }
            }
        }
        return count;
    }
}