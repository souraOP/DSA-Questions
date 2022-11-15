class Solution {
    public int maximum69Number (int num) {
        StringBuilder superSB = new StringBuilder();
        superSB.append(num);
        for(int i = 0; i < superSB.length(); i++){
            if(superSB.charAt(i) == '6'){
                superSB.setCharAt(i, '9');
                break;
            }
        }
        return Integer.parseInt(superSB.toString());
    }
}