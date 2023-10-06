class Solution {
    public String interpret(String command) {
        //1st Solution
        // String tS = command.replace("(al)", "al");
        // String fS = tS.replace("()", "o");
        // return fS;
        
        return command.replace("()", "o").replace("(al)", "al");
        
        //2nd Solution
        // StringBuilder sb = new StringBuilder(command.length());
        // for(int i = 0; i < command.length(); i++){
        //     if(command.charAt(i) == 'G'){
        //         sb.append('G');
        //     }
        //     if (command.charAt(i) == '('){
        //         if(command.charAt(i + 1) == ')'){
        //             sb.append('o');
        //             i= i + 1;
        //         } else {
        //             sb.append("al");
        //             i = i + 3;
        //         }
        //     }
        // }
        // return sb.toString();
    }
}