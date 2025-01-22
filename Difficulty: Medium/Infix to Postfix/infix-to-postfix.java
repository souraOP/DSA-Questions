//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            System.out.println(new Solution().infixToPostfix(br.readLine().trim()));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function to convert an infix expression to a postfix expression.
    public static String infixToPostfix(String s) {
        // Your code here
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            
            // if character is an operand
            if(!checkIfOperator(c)){
                sb.append(c);
            // if character is opening braces
            } else{
                 if(c == '(' || st.isEmpty()){
                    st.push(c);
                // if character is closing braces
                } else if (c == ')'){
                    while(!st.isEmpty() && st.peek() != '('){
                        sb.append(st.pop()); // put everything back to ans and pop from stack
                    }
                    st.pop(); // pop the last opening bracket also
                } else {
                    while(!st.isEmpty() && rankOrder(st.peek()) >= rankOrder(c)){
                        sb.append(st.pop());
                    }
                    st.push(c);
                }
            }
        }
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.toString();
    }
    
    static int rankOrder(char c){
        if(c == '^'){
            return 3;
        }
        if (c == '*' || c == '/'){
            return 2;
        }
        if (c == '+' || c == '-'){
            return 1;
        }
        return -1;
    }
    
    static boolean checkIfOperator(char c){
        if(c == '+' || c == '-' || c == '*' || c == '/' || c == '^' || c == '(' || c == ')'){
            return true;
        }
        return false;
    }
}