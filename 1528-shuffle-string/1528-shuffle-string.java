class Solution {
    public String restoreString(String s, int[] indices) {
        StringBuilder string1 = new StringBuilder(s);
        StringBuilder string2 = new StringBuilder(s);
        int lengthOfString= indices.length;
        for(int i = 0; i < lengthOfString; i++){
            int j = indices[i];
            string2.setCharAt(j, string1.charAt(i));
        }
        return string2.toString();
    }
}