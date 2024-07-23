class Solution {
    public String frequencySort(String s) {
         Map<Character, Integer> map = new HashMap<>();
        for(char c: s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);

        }
        System.out.println(map);
        // make an arraylist of all the keys
        ArrayList<Character> arrSorted = new ArrayList<>(map.keySet());

        // sort the arraylist using Collection.sort, b - a will sort in descending order
        Collections.sort(arrSorted, (a, b) -> (map.get(b) - map.get(a)));

        System.out.println(arrSorted.toString());

        StringBuilder sb = new StringBuilder();
        for(char c: arrSorted) {
            sb.append(String.valueOf(c).repeat(map.get(c)));
        }

        return sb.toString();
    }
}