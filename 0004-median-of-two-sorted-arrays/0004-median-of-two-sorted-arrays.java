class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length, m = nums2.length;
        int[] mergedArray = new int[m + n];
        int k = 0;
        for(int i = 0; i < n; i++) {
            mergedArray[k++] = nums1[i];
        }
        for(int j = 0; j < m; j++) {
            mergedArray[k++] = nums2[j];
        }
        Arrays.sort(mergedArray);
        int total = mergedArray.length;
        
        if(total % 2==1) {
            return ((double)(mergedArray[total/2]));
        } else {
            int middle1 = mergedArray[total/ 2 - 1];
            int middle2 = mergedArray[total/2];
            return ((double) middle1 + (double) middle2) / 2.0;
        }
    }
}