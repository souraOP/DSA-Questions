class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        // get the max value from the array
//         int get_max = getMaxValue(nums);
        
//         for(int d = 1; d <= get_max; d++) {
//             int sum = 0;
//             for(int i = 0; i < nums.length; i++) {
//                 sum += Math.ceil((double)nums[i]/(double)d);
//             }
//             if(sum <= threshold) {
//                 return d;
//             }
//         }
//         return -1;
        
        // base case
        if(nums.length > threshold){
            return -1;
        }
        
        // binary search begins
        int low = 1, high = getMaxValue(nums);
        while(low <= high) {
            int mid = (low + high) / 2;
            if(getSum(nums, mid) <= threshold) {
                high = mid - 1;
            } else {
                low = mid+1;
            }
        }
        return low;
        
    }
    
    public static int getMaxValue(int[] arr) {
        int maxi = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            maxi = Math.max(arr[i], maxi);
        }
        return maxi;
    }
    
    public int getSum(int[] arr, int d) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += Math.ceil((double)(arr[i])/(double)(d));
        }
        return sum;
    }
}