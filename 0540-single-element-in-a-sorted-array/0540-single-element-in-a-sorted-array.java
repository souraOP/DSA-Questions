class Solution {
    public int singleNonDuplicate(int[] nums) {
        // using hashmap
        HashMap<Integer, Integer> singleElement = new HashMap<>();
        for(int i : nums){
            singleElement.put(i, singleElement.getOrDefault(i, 0) + 1);
        }
        for(Map.Entry<Integer, Integer> entry : singleElement.entrySet()) {
            if(entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return -1;
    }
}