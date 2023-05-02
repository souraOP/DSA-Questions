class Solution {
    public int arraySign(int[] nums) {
        int number = 1;  //keeping the number as 1 (positive) because whenever I see any -ve integer i will flip it to '-number' & as soon as another negative integer comes then '-(-number)' i.e, will be positive. So, keeping it +ve!
        for(int i: nums){
            if(i == 0){
                return 0;
            }
            if(i < 0){   //if I come across any negative integer then just flip the sign of the number
                number = -number;
            }
        }
        return number;
    }
}