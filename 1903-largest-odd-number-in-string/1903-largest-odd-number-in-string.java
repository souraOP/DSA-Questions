class Solution {
    public String largestOddNumber(String num) {
        for(int i = num.length() - 1; i >= 0; i--){
            // odd digit ASCII value is odd number and
            // even digit ASCII value is even number 
            // so we simply divide character ascii value by 2
            // if we get remainder 1 it is odd
            // if remainder 0 then even 
            char ch = num.charAt(i);
            if(ch%2 == 1){
                // if its a odd digit 
                //then extract the subtring till the current index and 
                // return it back
                return num.substring(0, i+1);
            }
        }
        return "";
    }
}