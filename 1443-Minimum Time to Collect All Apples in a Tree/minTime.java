class Solution {
    public int minTime(int n, int[][] edges, List<Boolean> hasApple) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < n; i++){
            adj.add(new ArrayList<>());
        }
        for(int[] edge: edges){
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        return minTimeCollection(0, adj, hasApple, 0);
    }
    
    int minTimeCollection(int index, List<List<Integer>> adj, List<Boolean> hasApple, int parent){
        int total = 0;
        // for each neighbor of current node
        for(int nbr : adj.get(index)){
            // if the neighbor is the parent node, then we skip
            if (nbr == parent)
             continue;
            // we recursively call the helper function for each neighbor
            total += minTimeCollection(nbr, adj, hasApple, index);
        }
        // If current node is not the root (0th) node, and it has an apple or any of its descendant has
        //  then we need to add 2 time for moving to and from it
        if( index != 0 && (hasApple.get(index) || total > 0))
          total += 2;
        return total;
    }
}
