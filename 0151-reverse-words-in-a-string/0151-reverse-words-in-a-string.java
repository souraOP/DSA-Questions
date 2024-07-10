class Solution {
    public String reverseWords(String s) {
        String[] splittedString = s.trim().split("\\s+");
        String outputString = "";
        for(int i = splittedString.length - 1; i > 0; i--) {
            outputString += splittedString[i] + " ";
        }
        return outputString + splittedString[0];
    }
}