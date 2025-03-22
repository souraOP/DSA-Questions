class Solution {
    public int countCompleteComponents(int n, int[][] edges) {
        int cc = 0;
        List<List<Integer>> gra = new ArrayList<>();
        for(int i = 0; i < n; i++){
            gra.add(new ArrayList<>());
        }

        // storing the edges in the adjacency list
        for(int i = 0; i < edges.length; i++){
            gra.get(edges[i][0]).add(edges[i][1]);
            gra.get(edges[i][1]).add(edges[i][0]);
        }

        boolean vis[] = new boolean[n];
        for(int i = 0; i < n; i++){
            if(!vis[i]){
                Queue<Integer> q = new LinkedList<>();
                q.offer(i);
                List<Integer> list= new ArrayList<>();
                vis[i] = true;
                while(!q.isEmpty()){
                    int x = q.poll();
                    list.add(x);
                    for(int j: gra.get(x)){
                        if(!vis[j]){
                            q.offer(j);
                            vis[j] = true;
                        }
                    }
                }
                boolean flag = true;
                for(int j : list){
                    if(gra.get(j).size() != list.size()-1){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    cc++;
                }
            } 
        }
        return cc;
    }
}