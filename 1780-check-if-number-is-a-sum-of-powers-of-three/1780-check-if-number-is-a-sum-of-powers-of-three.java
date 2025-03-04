class Solution {
    public boolean checkPowersOfThree(int n) {
        // while(n>0){
        //     if(n % 3 == 2) {
        //         return false;
        //     }
        //     n = n / 3;
        // }
        // return true;

        String s = Integer.toString(n, 3);
        return !s.contains("2");
    }
}