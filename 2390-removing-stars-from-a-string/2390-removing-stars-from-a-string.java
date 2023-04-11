class Solution {
    public String removeStars(String s) {
        Stack<Character> bokachoda = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '*'){
                bokachoda.pop();
            } else {
                bokachoda.push(c);
            }
        }
        StringBuilder suorerBaccha = new StringBuilder();
        for(char c : bokachoda){
            suorerBaccha.append(c);
        }
        return suorerBaccha.toString();
    }
}