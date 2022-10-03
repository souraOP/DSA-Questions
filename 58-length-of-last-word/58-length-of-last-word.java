class Solution {
    public int lengthOfLastWord(String s) {
        String mystr = s.trim();
        return (mystr.length() - mystr.lastIndexOf(" ") - 1);
    }
}