//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
            for (int i = 0; i < V; i++) adj.add(new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            Solution obj = new Solution();
            ArrayList<Integer> ans = obj.dfsOfGraph(adj);
            for (int i = 0; i < ans.size(); i++) System.out.print(ans.get(i) + " ");
            System.out.println();

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(ArrayList<ArrayList<Integer>> adj) {
        // Code here
        int V = adj.size();
        boolean[] visited = new boolean[V];
        ArrayList<Integer> dfsList = new ArrayList<>();
        dfs(adj, visited, dfsList, 0);
        return dfsList;
        
    }
    
    private static void dfs(ArrayList<ArrayList<Integer>> adj, boolean[] visited, ArrayList<Integer> dfsList, int node) {
        // make the node as visited
        visited[node] = true;
        dfsList.add(node);
        
        for(int i: adj.get(node)) {
            if(!visited[i]) {
                dfs(adj, visited, dfsList, i);
            }
        }
    }
    
    
    
    
    
    
    
    
    
    
    
}