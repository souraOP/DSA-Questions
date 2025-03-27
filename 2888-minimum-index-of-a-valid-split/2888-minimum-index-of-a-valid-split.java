class Solution {
    public int minimumIndex(List<Integer> nums) {
        HashMap<Integer, Integer> map1 = new HashMap<>();
        for(int i: nums){
            map1.put(i, map1.getOrDefault(i, 0) + 1);
        }
        HashMap<Integer, Integer> map2 = new HashMap<>();
        for(int i = 0; i < nums.size(); i++){
            map1.put(nums.get(i), map1.get(nums.get(i)) - 1);
            map2.put(nums.get(i), map2.getOrDefault(nums.get(i), 0) + 1);

            if(map1.get(nums.get(i)) * 2 > nums.size() - i - 1 && map2.get(nums.get(i)) * 2 > i + 1){
                return i;
            } 
        }
        return -1;
    }
}