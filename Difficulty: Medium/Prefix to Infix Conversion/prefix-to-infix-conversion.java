//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            sc.nextLine();
            String s = sc.next();
            Solution obj = new Solution();
            String ans = obj.preToInfix(s);
            System.out.println(ans);
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static String preToInfix(String s) {
        // code here
        /* 
            1. Start iterating from the back
                - if an operand is found -> put that into the stack
                - if an operator is found -> take the top 2 operand from the stack, then
                    do ( A <operator> B)
                    
        */
        
        Stack<String> st = new Stack<>();
        for(int i = s.length()-1; i >= 0; i--){
            char c = s.charAt(i);
            if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9')){
                st.push(String.valueOf(c));
            } else {
                String top1 = st.pop();
                String top2 = st.pop();
                st.push("(" + top1 + String.valueOf(c) + top2 + ")");
            }
        }
        return st.peek();
    }
}
