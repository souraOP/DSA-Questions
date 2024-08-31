class Solution {
    public List<String> commonChars(String[] arr) {
List<String> res = new ArrayList<>();
        int[] minFreq = new int[26];
        Arrays.fill(minFreq, Integer.MAX_VALUE);
        for(String word: arr) {
            int[] charCount = new int[26];
            for(char c: word.toCharArray()) {
                charCount[c - 'a']++;
            }
            for (int i = 0; i < 26; i++) {
                minFreq[i] = Math.min(minFreq[i], charCount[i]);
            }
        }
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < minFreq[i]; j++) {
                res.add(String.valueOf((char)(i + 'a')));
            }
        }
        return res;

    }
}