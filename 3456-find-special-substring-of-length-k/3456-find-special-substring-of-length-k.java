class Solution {
    public boolean hasSpecialSubstring(String str, int k) {
        // if(str.length() < k) return false;
		int count = 1;
		for(int i = 1; i < str.length(); i++) {
            if(str.charAt(i) == str.charAt(i-1)){
                count++;
            } else {
                if(count == k) {
                    return true;
                }
                count = 1;
            }
		
			
		}

		return k == count;
    }
}