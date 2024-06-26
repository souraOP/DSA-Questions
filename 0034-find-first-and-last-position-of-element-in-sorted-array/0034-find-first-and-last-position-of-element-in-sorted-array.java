class Solution {
    public int[] searchRange(int[] nums, int target) {
        // Linear Search approach
        
        // int firstOcc = -1, lastOcc = -1;
        // for(int i = 0; i < nums.length; i++) {
        //     if(nums[i] == target) {
        //         firstOcc = i;
        //         break;
        //     }
        // }
        // for(int i = nums.length - 1; i >= 0; i--) {
        //     if(nums[i] == target){
        //         lastOcc = i;
        //         break;
        //     }
        // }
        // return new int[] {firstOcc, lastOcc};
        
    
        
        // Binary Search Approach
        
        int start = 0, end = nums.length - 1;
        int firstOcc = -1, lastOcc = -1;
        if (nums.length == 0) {
            return new int[] {firstOcc, lastOcc};
        }
        firstOcc = getFirstOccurence(nums, target, start, end);
        lastOcc = getLastOccurence(nums, target, start, end);
        return new int[] {lastOcc, firstOcc};
        
    }
    public static int getFirstOccurence(int[] nums, int target, int start, int end) {
        int curr_pos = -1;
        while(start <= end) {
            int middle_element = start + (end - start) /2;
            if(target >= nums[middle_element]) {
                start = middle_element + 1;
                
            } else {
                end = middle_element - 1;
            }
            if(nums[middle_element] == target) {
                curr_pos = middle_element;
            }
        }
        return curr_pos;
    }
    
    public static int getLastOccurence(int[] nums, int target, int start, int end) {
        int curr_pos = -1;
        while(start <= end) {
            int middle_element = start + (end - start) /2;
            if(target <= nums[middle_element]) {
                end = middle_element - 1;
                
            } else {
                start = middle_element + 1;
            }
            if(nums[middle_element] == target) {
                curr_pos = middle_element;
            }
        }
        return curr_pos;
    }
}