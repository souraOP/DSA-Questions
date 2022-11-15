class Solution {
    public int maximum69Number (int num) {
        String ankita = "" + num;
        return Integer.parseInt(ankita.replaceFirst("6", "9"));
    }
}