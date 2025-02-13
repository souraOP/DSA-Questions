class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k=k%n;
        Queue<Integer> q = new LinkedList<>();
        // taking the part that goes first in the array
        for(int i = n-k;i<n;i++){
            q.add(nums[i]);
        }
        // the part that moves to right
        for(int i = 0; i < n-k;i++){
            q.add(nums[i]);
        }

        // putting them into the array
        for(int i = 0; i < n; i++) {
            nums[i] = q.remove();
        }
    }
}