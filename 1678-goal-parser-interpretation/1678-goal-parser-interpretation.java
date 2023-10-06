class Solution {
    public String interpret(String command) {
        String tS = command.replace("(al)", "al");
        String fS = tS.replace("()", "o");
        return fS;
    }
}