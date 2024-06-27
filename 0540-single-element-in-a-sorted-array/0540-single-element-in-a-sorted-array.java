class Solution {
    public int singleNonDuplicate(int[] nums) {
        // using hashmap
        // HashMap<Integer, Integer> singleElement = new HashMap<>();
        // for(int i : nums){
        //     singleElement.put(i, singleElement.getOrDefault(i, 0) + 1);
        // }
        // for(Map.Entry<Integer, Integer> entry : singleElement.entrySet()) {
        //     if(entry.getValue() == 1) {
        //         return entry.getKey();
        //     }
        // }
        // return -1;
        
        // using binary search
        int low = 0;
        int high = nums.length - 1;
        while(low < high) {
            int mid = low + (high - low) /2;
            if(mid % 2 == 1) {
                mid--;
            }
            
            if(nums[mid] == nums[mid + 1]) {
                low = mid + 2;
            }
            else {
                high = mid;
            }
            
            
        }
        return nums[low];
    }
}