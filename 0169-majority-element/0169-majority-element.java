class Solution {
    public int majorityElement(int[] nums) {
        // Brute Approach
        // for(int i = 0; i < nums.length; i++) {
        //     int c = 0;
        //     for(int j = 0; j < nums.length; j++) {
        //         if(nums[j] == nums[i]){
        //             c++;
        //         }
        //     }
        //     if(c > nums.length/2) {
        //         return nums[i];
        //     }
        // }
        // return -1;
        
        //  Using HashMap
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        
        // fetching the major element
        for(Map.Entry<Integer, Integer> index: map.entrySet()) {
            if(index.getValue() > (nums.length/2)) {
                return index.getKey();
            }
        }
        return -1;
        
        
        
        
        
        
        
        
    }
}