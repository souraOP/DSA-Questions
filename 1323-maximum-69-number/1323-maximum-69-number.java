class Solution {
    public int maximum69Number (int num) {
        if(num%10000 >= 6000 && num%10000 < 9000){
            num += 3000;
        } else if(num % 1000 >= 600 && num % 1000 < 900){
            num += 300;
        } else if(num % 100 >= 60 && num % 100 < 90){
            num += 30;
        } else if(num % 10 == 6){
            num += 3;
        }
        return num;
    }
}