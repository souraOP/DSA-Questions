class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> rad = new LinkedList<>();
        Queue<Integer> dir = new LinkedList<>();
        int n = senate.length();
        
        //adding the Radiant and Dire to the 2 different queues
        for(int i = 0; i < n; i++){
            if(senate.charAt(i) == 'R'){
                rad.offer(i);
            } else {
                dir.offer(i);
            }
        }

        //for the voting process
        while(!rad.isEmpty() && !dir.isEmpty()){
            int R = rad.poll();
            int D = dir.poll();
            if(R < D){
                rad.offer(R + n);
            } else {
                dir.offer(D + n);
            }
        }
        if(rad.isEmpty()){
            return "Dire";
        } else{
            return "Radiant";
        }
    }
}