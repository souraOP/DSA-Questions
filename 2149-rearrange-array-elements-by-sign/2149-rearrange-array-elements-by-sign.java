class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        
        // segregate the array into positive and negative elements
        
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] < 0) {
                neg.add(nums[i]);
            } else {
                pos.add(nums[i]);
            }
        }
        
        // rearrange and put the arrays into each place
        for(int i = 0; i < pos.size(); i++) {
            nums[2 * i] = pos.get(i);   // for placing positive numbers at even places
            nums[2 * i + 1] = neg.get(i); // for placing negative numbers at odd places
        }
        return nums;
    }
}