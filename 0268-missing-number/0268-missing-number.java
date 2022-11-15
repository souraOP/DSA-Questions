class Solution {
    public int missingNumber(int[] nums) {
        int len = nums.length;
        if (len == 0) {
            return 0;
        }

        Arrays.sort(nums);
        int start = 0;
        int end = len;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > mid) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }
}