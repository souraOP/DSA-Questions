//{ Driver Code Starts
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
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for (int i = 0; i < V; i++) adj.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            Solution obj = new Solution();
            boolean ans = obj.isCycle(adj);
            if (ans)
                System.out.println("1");
            else
                System.out.println("0");

            System.out.println("~");
        }
    }
}
// } Driver Code Ends

class Pair {
    int node;
    int parentNode;
    public Pair(int node, int parentNode) {
        this.node = node;
        this.parentNode = parentNode;
    }
}


class Solution {
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(ArrayList<ArrayList<Integer>> adj) {
        // Code here
        // create the visited array
        boolean[] vis = new boolean[adj.size()];
        // make the vis array as false 
        for(int i = 0; i < adj.size(); i++) {
            vis[i] = false;
        }
        
        for(int i = 0; i<adj.size(); i++) {
            if(vis[i] == false) {
                if(detectCycle(i, adj, vis) == true) {
                    return true;
                }
                
            }
        }
        return false;
    }
    
    private boolean detectCycle(int src, ArrayList<ArrayList<Integer>> adj, boolean[] vis) {
        vis[src] = true;
        Queue<Pair> q = new LinkedList<Pair>();
        q.add(new Pair(src, -1));
        while(!q.isEmpty()) {
            // take the current node
            int node = q.peek().node;
            int parentNode = q.peek().parentNode;
            q.remove();
            // go through the adj list
            for(int a: adj.get(node)) {
                if(vis[a] == false) {
                    q.add(new Pair(a, node));
                    vis[a] = true;
                } else if (parentNode != a) {
                    return true;
                }
            }
        }
        return false;
    }
}