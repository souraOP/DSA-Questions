class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int n: nums){
            if(mp.containsKey(n)){
                list.add(n);
            }
            mp.put(n, 1);
        }
        return list;

    }
}