class Solution {
    public int findCircleNum(int[][] isConnected) {
        // convert the adj matrix to adj list
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
        int V = isConnected.length;
        int M = isConnected[0].length;
        int[] visited = new int[V];
        for(int i = 0; i < V; i++) {
            adj.add(new ArrayList<Integer>());
        }

        // conversion
        for(int i = 0; i < V; i++) {
            for(int j = 0 ; j < V; j++) {
                if(isConnected[i][j] == 1 & i != j ) {
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }
        int count = 0;
        for(int i = 0; i < V; i++) {
            if(visited[i] != 1) {
                count++;
                dfs(i, adj, visited);
            }
        }
        return count;
    }

    public void dfs(int i, ArrayList<ArrayList<Integer>> adj, int[] visited) {
        visited[i] = 1;
        for(int a: adj.get(i)) {
            if(visited[a] != 1) {
                dfs(a, adj, visited);
            }
        }
    }
}