class Solution {
    int MOD = (int)1e9+7;
    public int countGoodNumbers(long n) {
        long first, second = n/2;
        if(n % 2== 0) {
            first = n/2;
        } else {
            first = (n/2) + 1;
        }
        long firstMult = power(5, first)%MOD;
        long secondMult = power(4, second)%MOD;
        long ans = 1;
        ans = (ans * firstMult)%MOD;
        if(second != 0){
            ans = (ans * secondMult)%MOD;
        } else{
            ans=ans;
        }
        return (int)(ans%MOD);
    }

    public long power(long x, long y){
        if(y==0){
            return 1;
        }
        long temp = power(x, y/2);
        if(y % 2 == 0){
            return (temp * temp) % MOD;
        } else {
            return (x*temp*temp) % MOD;
        }
    }
}