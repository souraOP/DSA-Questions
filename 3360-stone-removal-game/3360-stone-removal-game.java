class Solution {
    public boolean canAliceWin(int n) {
        int a = 10;
        boolean is_alice = true;
        while(n > 0){
            if(n < a){
                return !is_alice;
            }
            n -= a; // if n = 12, then for 2nd turn we have n as 2 
            is_alice ^= true; // flipping the value so that the above if statement will give it as true; as true^true = false -> !false = true.
            a--;


        }
        if(n == 0) {
            return !is_alice;
        }
        return false;
    }
}