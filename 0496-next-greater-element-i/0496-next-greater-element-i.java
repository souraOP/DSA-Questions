class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length];
        for(int i = 0; i < nums1.length; i++){
            int index = -1;
            int a = -1;
            for(int j = 0; j < nums2.length; j++){
                if(nums1[i] == nums2[j]){
                    index = j;
                    break;
                }
            }

            // finding the next greater element
            for(int k = index; k < nums2.length; k++){
                if(nums2[k]>nums1[i]){
                    a = nums2[k];
                    break;
                }
            }
            arr[i] = a;
        }
        return arr;
    }
}