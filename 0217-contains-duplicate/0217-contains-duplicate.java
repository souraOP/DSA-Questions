class Solution {
    public boolean containsDuplicate(int[] nums) {
//         Arrays.sort(nums);
//         int m = nums.length;
//         for(int i = 1; i < m ; i++){
//             if(nums[i-1] == nums[i]){
//                 return true;
//             }
            
//         }
//         return false;
        
        
        HashSet<Integer> myArr = new HashSet<>();
        for (int num: nums){
           if(myArr.contains(num))
               return true;
            myArr.add(num);
        }
        return false;
        
    }
}