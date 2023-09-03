class Solution {
    public List<String> letterCombinations(String digits) {
        LinkedList<String> ans = new LinkedList<String>();
		if(digits.isEmpty()) return ans;
		String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
		ans.add("");
        for(int i = 0; i < digits.length(); i++){
            int z = Character.getNumericValue(digits.charAt(i));
            while(ans.peek().length() == i){
                String pontu = ans.remove();
                for(char c : mapping[z].toCharArray()){
                    ans.add(pontu + c);
                }
            }
        
        }
        return ans;
    }
}