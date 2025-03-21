class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        // hold the first string 
        String ans = strs[0];
        // we gonna compare that shit with the rest 
        for(int i = 1; i < strs.length; i++) {
            while(strs[i].indexOf(ans) != 0) {
                ans = ans.substring(0, ans.length() - 1);
                if(ans.isEmpty()){
                    return "";
                }
            }
        }
        return ans;

        
    }
}