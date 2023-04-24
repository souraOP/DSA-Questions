class Solution {
    public int lastStoneWeight(int[] stones) {
        Arrays.sort(stones);
        int totalStones= stones.length - 1;
        while(totalStones != 0){
            if(stones[stones.length-1] == stones[stones.length-2]){
                stones[stones.length-1] = 0;
                stones[stones.length-2] = 0;
            }
            else if(stones[stones.length-1] != stones[stones.length-2]){
                stones[stones.length-1] -= stones[stones.length-2];
                stones[stones.length-2] = 0;
            }
            Arrays.sort(stones);
            totalStones--;
        }
        return stones[stones.length-1];
    }
    
}