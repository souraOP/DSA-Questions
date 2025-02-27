class Solution {
    public boolean hasSameDigits(String s) {
        StringBuilder sb= new StringBuilder(s);
        while(sb.length() > 2){
            StringBuilder scsb = new StringBuilder();
            for(int i = 0; i < sb.length() - 1; i++){
                int a = sb.charAt(i) - '0';
                int b = sb.charAt(i + 1) - '0';
                scsb.append((char)('0' + (a +b) % 10));
            }
            sb = scsb;
        }
        return sb.charAt(0) == sb.charAt(1);
    }
}