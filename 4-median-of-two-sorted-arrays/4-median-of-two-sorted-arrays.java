class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] finalArr = new int[nums1.length + nums2.length];
        int i = 0, j = 0, k = 0;
        while( i < nums1.length && j < nums2.length){
            if(nums1[i] <= nums2[j]){
                finalArr[k++] = nums1[i++];
            } else {
                finalArr[k++] = nums2[j++];
            }
        }
        if(i == nums1.length){
            for(; k < nums1.length + nums2.length; k++){
                finalArr[k] = nums2[j++];
            }
        } else {
            for (; k < nums1.length + nums2.length; k++){
                finalArr[k] = nums1[i++];
            }
        }
        
        if(finalArr.length % 2 == 1){
            return (double)finalArr[finalArr.length/2];
        } else {
            return (double)(finalArr[finalArr.length/2] + finalArr[finalArr.length/2 - 1]) / 2;
        }


    }
}