//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int V = Integer.parseInt(read.readLine());
            
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            
            for(int i=0; i<V; i++)
            {
                String S[] = read.readLine().split(" ");
                ArrayList<Integer> temp = new ArrayList<>();
                for(int j=0; j<V; j++)
                    temp.add(Integer.parseInt(S[j]));
                adj.add(temp);
            }

            Solution ob = new Solution();
            System.out.println(ob.numProvinces(adj,V));
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int numProvinces(ArrayList<ArrayList<Integer>> adj, int V) {
        // code here
        int count = 0;
        int[] vis=new int[V];
        for(int i = 0; i < V; i++) {
            if(vis[i] != 1) {
                count++;
                dfs(adj, vis, i);
            }
        }
        return count;
        
    }
    
    static void dfs(ArrayList<ArrayList<Integer>> adj, int[] vis, int i) {
        vis[i] = 1;
        for(int a = 0; a < adj.get(i).size(); a++) {
            if(vis[a] != 1 && adj.get(i).get(a) == 1) {
                dfs(adj, vis, a);
            }
        }
    }
};