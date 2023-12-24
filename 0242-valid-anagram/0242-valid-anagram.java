class Solution {
    public boolean isAnagram(String s, String t) {
        // base case
        if(s.length() != t.length()){
            return false;
        }
        int[] track = new int[26];    // for 26 lowercase english alphabets
        for(int i = 0; i < t.length(); i++){
            track[s.charAt(i) - 'a']++;
            track[t.charAt(i) - 'a']--;
        }
        for(int n: track){
            if(n != 0) return false;
        }
        return true;
    }
}