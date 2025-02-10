class Solution {
    public String removeKdigits(String nums, int k) {
        String res = ""; 
        if(nums.length() == k){
            return "0";
        }
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < nums.length(); i++){
            while(!st.isEmpty() && k > 0 && (st.peek() - '0') > (nums.charAt(i)-'0')){
                st.pop();
                k--;
            }
            st.push(nums.charAt(i));
            
        }
        while(k > 0){
            st.pop();
            k--;
        }
        if(st.isEmpty()) return "0";
        while(!st.isEmpty()){
            res += st.pop();
        }
        String ans = "";
        int j;
        for(j = res.length()-1; j > 0; j--){
            if(res.charAt(j) != '0'){
                break;
            }
        }
        for(int i = j; i >=0; i--){
            ans+=res.charAt(i);
        }
        return ans;
    }
}