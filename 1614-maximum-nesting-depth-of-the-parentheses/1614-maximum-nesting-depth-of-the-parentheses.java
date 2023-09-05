class Solution {
    public int maxDepth(String s) {
        int depth = 0;
        int openParenthesis = 0;
        for(char ch: s.toCharArray()) {
            if( ch == '(') {
                openParenthesis++;
            }
            if( ch == ')'){
                openParenthesis--;
            }
            depth = Math.max(depth, openParenthesis);
        }
        return depth;
    }
}