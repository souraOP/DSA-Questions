class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        if(n == 1) return 0;
        
        // int max = Integer.MIN_VALUE, index = 0;
        // for(int i = 0; i < n; i++) {
        //     if(max < nums[i]) {
        //         max = nums[i];
        //         index = i;
        //     }
        // } 
        // return index;
        
        int start = 0, end = n -1;
        while(start <= end) {
            int mid = start + (end - start) /2;
            // need to check if mid is the peak element or not
            
            // (mid > 0 & mid < n-1): if mid is at the boundary or not
            // (nums[mid] > nums[mid - 1] & nums[mid] < nums[mid + 1]): if mid is greater than it neighbouring elements 
            if((mid > 0 && mid < n - 1) && (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1])){
                return mid; // mid is the peak
            }
            
            // checking for left and right
            else if (mid < n - 1 && nums[mid] < nums[mid + 1]){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        
        if(nums[0] > nums[1]) {
            return 0;
        } else {
            return n -1;
        }
    }
}