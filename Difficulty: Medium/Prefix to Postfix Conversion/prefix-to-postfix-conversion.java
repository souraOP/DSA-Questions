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
            String ans = obj.preToPost(s);
            System.out.println(ans);
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static String preToPost(String s) {
        // code here
        Stack<String> st = new Stack<>();
        
        
        // start from the end
        for(int i = s.length()-1; i>= 0; i--){
            char c = s.charAt(i);
            // if its an operand
            if(Character.isLetterOrDigit(c)){
                st.push(String.valueOf(c));
            } else {
                String top1 = st.pop();
                String top2 = st.pop();
                st.push(top1 + top2 + String.valueOf(c));
            }
        }
        return st.peek();
    }
}
