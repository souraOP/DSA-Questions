class Solution {
    public String decodeString(String s) {
        Stack<Integer> count = new Stack<>();
        Stack<String> result = new Stack<>();
        int i = 0;
        result.push("");
        while(i < s.length()){
            char ch = s.charAt(i);
            if(ch >= '0' && ch <= '9'){
                int start = i;
                while(s.charAt(i + 1) >= '0' && s.charAt(i + 1) <= '9'){
                    i++;
                }
                count.push(Integer.parseInt(s.substring(start, i + 1)));
                
            } else if (ch == '['){
                result.push("");
            } else if (ch == ']'){
                StringBuilder sb = new StringBuilder();
                String str = result.pop();
                int x = count.pop();
                for(int j = 0 ; j <x; j++){
                    sb.append(str);
                }
                result.push(result.pop() + sb.toString());
            } else {
                result.push(result.pop() + ch);
            }
            i += 1;
        }
        return result.pop();
    }
}