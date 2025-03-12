class Solution {
    public int findLHS(int[] arr) {
        if(arr.length == 0 || arr == null) {
			return 0;
		}

		Arrays.sort(arr);
		int left =0, right = 1;
		int ans = 0;
		while(right < arr.length){
			int diff = arr[right] - arr[left];
			if(diff == 1){
				ans = Math.max(ans, right - left + 1);
			}

			if(diff <= 1) {
				right++;
			} else {
				left++;
			}
		}
		return ans;

    }
}