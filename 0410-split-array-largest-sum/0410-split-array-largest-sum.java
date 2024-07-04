class Solution {
    int res = 0;
    public int splitArray(int[] nums, int k) {
        int min = Integer.MIN_VALUE, max = 0;
        for(int i: nums){
            max += i;
            min = Math.max(min, i);
        }
        int mid = min + (max - min)/2;
        binarySearch(nums, k, min, mid, max);
        return res;
    }
    public void binarySearch(int[] nums, int k, int start, int mid, int end ) {
        if(start > end) {
            return;
        }
        mid = start + (end - start) / 2;
        if(isFeasible(nums, k, mid) <= k) {
            end = mid - 1;
            res = mid;
            binarySearch(nums, k, start, mid, end);
            
        }
        else {
            start = mid + 1;
            binarySearch(nums, k, start, mid, end);
        }
    }
    
    public int isFeasible(int[] nums, int k, int mid) {
        int c = 0, total = 0;
        for(int i: nums) {
            if(total + i <= mid) {
                total += i;
            }else {
                c++;
                total = i;
            }
        }
        return c + 1;
    }
}