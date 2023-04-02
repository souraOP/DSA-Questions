class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int spellsLength = spells.length;
        int[] result = new int[spellsLength];
        
        int potionsLength = potions.length;
        for(int i = 0; i < spellsLength; i++){
            int eachSpell = spells[i];
            int start = 0;
            int end = potionsLength - 1;
            while(start <= end){
                int mid = start + (end - start)/2;
                long product = (long) eachSpell*potions[mid];
                if(product >= success){
                    end = mid - 1;
                } else{
                    start = mid + 1;
                }
            }
            result[i] = potionsLength - start;
        }
        return result;
        
        
    }
}