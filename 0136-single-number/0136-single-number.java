class Solution {
    public int singleNumber(int[] nums) {
        int ankita = 0;
        for(int fuck: nums){
            ankita = ankita ^ fuck;
            
        }
        return ankita;
        
    }
}