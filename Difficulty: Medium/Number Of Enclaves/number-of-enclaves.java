//{ Driver Code Starts
// Initial Template for Java

// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int T = Integer.parseInt(in.readLine());
        while (T-- > 0) {
            String s[] = in.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int a[][] = new int[n][m];
            for (int i = 0; i < n; i++) {
                s = in.readLine().trim().split(" ");
                for (int j = 0; j < m; j++) {
                    a[i][j] = Integer.parseInt(s[j]);
                }
            }
            Solution ob = new Solution();
            out.println(ob.numberOfEnclaves(a));
        
out.println("~");
}
        out.close();
    }
}
// } Driver Code Ends



class Pair {
    int row;
    int col;
    public Pair(int row, int col){
        this.row = row;
        this.col = col;
    }
}

class Solution {
    public int numberOfEnclaves(int[][] grid) {
        int n = grid.length; // number of rows
        int m = grid[0].length; // number of columns
        Queue<Pair> q = new LinkedList<Pair>();
        // make the visited matrix
        boolean[][] vis = new boolean[n][m]; // Use boolean array for visited

        // Add boundary land cells to the queue and mark them as visited
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // Check if it's a boundary cell
                if (i == 0 || j == 0 || i == n - 1 || j == m - 1) {
                    if (grid[i][j] == 1) {
                        q.add(new Pair(i, j));
                        vis[i][j] = true; // Mark as visited
                    }
                }
            }
        }

        // Directions for moving up, right, down, left
        int[] dRow = {-1, 0, +1, 0};
        int[] dCol = {0, +1, 0, -1};

        // Perform BFS
        while (!q.isEmpty()) {
            Pair current = q.poll();
            int r = current.row;
            int c = current.col;

            for (int i = 0; i < 4; i++) {
                int nRows = r + dRow[i];
                int nCols = c + dCol[i];

                if (nRows >= 0 && nRows < n && nCols >= 0 && nCols < m && !vis[nRows][nCols] && grid[nRows][nCols] == 1) {
                    q.add(new Pair(nRows, nCols));
                    vis[nRows][nCols] = true; // Mark as visited
                }
            }
        }

        // Count the remaining land cells that are not visited
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1 && !vis[i][j]) {
                    count++;
                }
            }
        }

        return count;
    }
}
