class Solution {
    public boolean isValid(String s) {
        Stack<Character> myStack = new Stack<>();
        char[] inputArray = s.toCharArray();
        for(char c: inputArray){
            if(c == '(' || c == '{' || c == '['){
                myStack.push(c);
            } else {
                if(myStack.isEmpty()) return false;
                if(myStack.peek() == '[' && c!= ']'){
                    return false;
                    
                }
                if(myStack.peek() == '{' && c != '}'){
                    return false;
                }
                if(myStack.peek() == '(' && c != ')'){
                    return false;
                }
                myStack.pop();
            }
        }
        return myStack.isEmpty();
    }
}