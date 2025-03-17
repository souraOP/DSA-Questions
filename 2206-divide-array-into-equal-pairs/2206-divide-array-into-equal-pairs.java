class Solution {
    public boolean divideArray(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> mp = new HashMap<>();

        // creating the hashmap from the given array
        for(int i = 0; i < n; i++) {
            mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);
        }

        // checking if the map values are 2 or not
        // by checking if it's divisible by 2

        for(Map.Entry<Integer, Integer> entry: mp.entrySet()){
            if(entry.getValue() % 2 != 0){
                return false;
            }
        }
        return true;
    }
}