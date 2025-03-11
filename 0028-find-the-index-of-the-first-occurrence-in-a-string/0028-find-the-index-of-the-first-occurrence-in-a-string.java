class Solution {
    public int strStr(String haystack, String needle) {
        int h = haystack.length();
        int n = needle.length();
        if(h < n) return -1;
        int needleIndex = 0;
        for(int i = 0; i < h;i++) {
            // if the characters are equal, then increment the needle index
            if(haystack.charAt(i) == needle.charAt(needleIndex)){
                needleIndex++;
            }
            else {
                i = i - needleIndex;
                needleIndex = 0;
            }

            if(needleIndex == n) {
                return i-needleIndex+1;
            }
        }
        return -1;
    }
}