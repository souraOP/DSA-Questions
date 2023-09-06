class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int maxLen = -1;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            int lastIndex = s.lastIndexOf(c);
            if(lastIndex != i){
                maxLen = Math.max(maxLen, lastIndex - i - 1);
                
            }
        }
        return maxLen;
    }
}