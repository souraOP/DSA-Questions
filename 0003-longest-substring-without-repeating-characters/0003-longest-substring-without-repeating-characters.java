class Solution {
    public int lengthOfLongestSubstring(String str) {
        // if(str.length() == 0 || str == null){
        //     return 0;
        // }
        // if(str.equals(" ")) return 1;
        // int res = Integer.MIN_VALUE;
        // // run a for loop over the whole string
        // for(int i = 0; i < str.length(); i++){
        //     // implement the hashset 
        //     HashSet<Character> set = new HashSet<>();
        //     // run another for loop starting with i
        //     // this is for checking if any repeating character occurs in the string
        //     for(int j = i; j < str.length(); j++){
        //         // now we are going to check if there's any character thats occuring again
        //         if(set.contains(str.charAt(j))){
        //             // get the max one
        //             // j - i will give us the length
        //             res = Math.max(res, j - i);
        //             break;
        //         }
        //         else {
        //             // else add that character to the set
        //             set.add(str.charAt(j));
        //         }
        //     }
        // }
        // return res;

        if(str.length() == 0 || str == null){
            return 0;
        }

        int res = 0;
        int j = 0;
        HashSet<Character> set = new HashSet<>();

        for(int i = 0; i < str.length(); i++){
            while(set.contains(str.charAt(i))){
                set.remove(str.charAt(j));
                j++;
            }
            set.add(str.charAt(i));
            res = Math.max(res, i - j + 1);
        }
        return res;
        
        
    }
}