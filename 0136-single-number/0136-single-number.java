class Solution {
    public int singleNumber(int[] nums) {
//         for(int i = 0; i < nums.length; i++) {
//             int c = 0;
//             // store the element
//             int z = nums[i];
            
//             // apply linear search
//             for(int j = 0; j < nums.length; j++) {
//                 if(nums[j] == z){
//                     c++;
//                 }
//             }
//             if(c == 1) return z;
//         }
//         return -1;
        
        // Using hashmap
        HashMap<Integer, Integer> map = new HashMap<>();
        
        //putting everything inside the hashmap
        for(int i = 0; i < nums.length; i++){
            //loop through and put the element alongwith their frequency
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for(Map.Entry<Integer, Integer> it: map.entrySet()) {
            if(it.getValue() == 1) {
                return it.getKey();
            }
        }
        
        return -1;
        
        
    }
}