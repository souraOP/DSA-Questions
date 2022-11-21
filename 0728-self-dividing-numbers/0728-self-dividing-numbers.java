class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList();
        for(int i = left; i <= right; ++i){
            if(dividingNumber(i)){
                ans.add(i);
            } 
        }
        return ans;
    }
    
    public boolean dividingNumber(int n){
        int x = n;
        while(x > 0){
            int lastDigit = x % 10;
            x /= 10;
            if(lastDigit == 0 || (n % lastDigit) > 0){
                return false;
            }
        }
        return true;
    }
    
}