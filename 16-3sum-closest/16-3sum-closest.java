class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest = nums[0] + nums[1]+nums[nums.length-1];
        for(int i = 0; i <nums.length; i++){
            int start = i + 1;
            int end = nums.length -1;
            int sum = 10000000;
            while(start < end){
                sum = nums[i]+nums[start]+nums[end];
                if(Math.abs(target - sum) < Math.abs(target - closest)){
                    closest = sum;
                } else if (sum < target) {
                    start = start + 1;
                } else {
                    end = end - 1;
                }
            }
        }
        return closest;
    }
}