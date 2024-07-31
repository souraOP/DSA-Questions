class Solution {
    public int myAtoi(String s) {
        final int len = s.length();
        // if length is zero return 0
        if(len == 0){
            return 0;
        }

        int index = 0;
        // ignoring the whitespaces and as well as incrementing our index as we go along the string
        while(index < len && s.charAt(index) == ' '){
            ++index;
        }

        boolean isNegative = false;
        //handling the sign cases
        if(index < len){
            if(s.charAt(index) == '-'){
                isNegative = true;
                ++index;
            } else if(s.charAt(index) == '+'){
                ++index;
            }
        }

        // converting from character to integer form
        // we gotta iterate until any non zero character is found
        int ans = 0;
        while(index < len && isDigit(s.charAt(index))){
            int digit = s.charAt(index) - '0';

            // to avoid integer overflow
            if(ans > (Integer.MAX_VALUE / 10) || (ans == (Integer.MAX_VALUE / 10) && digit > 7 )){
                return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            ans = (ans * 10) + digit;

            ++index;
        }

        return isNegative ? -ans : ans;
    }

    private boolean isDigit(char ch){
        return ch >= '0' && ch <= '9';
    }
}