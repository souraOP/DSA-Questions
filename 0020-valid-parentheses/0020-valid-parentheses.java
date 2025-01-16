class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        // convert the string to character array
        char[] c = s.toCharArray();
        for(int i = 0; i < s.length(); i++){
            // put the opening brackets
            if(c[i] == '(' || c[i] == '{' || c[i] == '['){
                st.push(c[i]);
            } else {
                if(st.isEmpty()){
                    return false;
                }
                // check for closing brackets 
                if(st.peek() == '(' && c[i] != ')'){
                    return false;
                }
                if(st.peek() == '{' && c[i] != '}'){
                    return false;
                }
                if(st.peek() == '[' && c[i] != ']'){
                    return false;
                }
                
                st.pop();
            }
        }
        return st.isEmpty();
    }
}