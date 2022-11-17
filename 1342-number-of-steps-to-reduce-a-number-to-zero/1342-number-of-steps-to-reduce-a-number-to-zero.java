class Solution {
    public int numberOfSteps(int num) {
        return countSteps(num, 0);
    }
    private int countSteps(int n, int totalSteps){
        if(n == 0) return totalSteps;
        if(n % 2 == 0){
            return countSteps(n / 2, totalSteps = totalSteps + 1);
        } else {
            return countSteps(n - 1, totalSteps = totalSteps + 1);
        }
    }
}