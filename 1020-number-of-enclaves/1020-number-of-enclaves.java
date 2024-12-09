class Pair {
    int row;
    int col;
    public Pair(int row, int col){
        this.row = row;
        this.col = col;
    }
}

class Solution {
    public int numEnclaves(int[][] grid) {
        int n= grid.length;
        int m = grid[0].length;
        Queue<Pair> q = new LinkedList<Pair>();
        // make the visited matrix
        boolean[][] vis = new boolean[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                // first row, first col, last row, last col
                if(i == 0 || j == 0 || i == n - 1 || j == m - 1){
                    if(grid[i][j] == 1){
                        q.add(new Pair(i, j));
                        vis[i][j] = true;
                    }
                }
            }
        }

        // make the movements
        int[] dRow = {-1, 0, +1, 0};
        int[] dCol = {0, +1, 0, -1};

        // do the bfs
        while(!q.isEmpty()){
            int r = q.peek().row;
            int c = q.peek().col;
            //remove from the queue
            q.remove();
            for(int i = 0; i < 4; i++){
                //neighbours Rows and cols movement
                int nRows= r + dRow[i];
                int nCols = c + dCol[i];
                if(nRows >= 0 && nRows < n && nCols >= 0 && nCols < m && vis[nRows][nCols] == false && grid[nRows][nCols] == 1){
                    q.add(new Pair(nRows, nCols));
                    vis[nRows][nCols] = true;
                }
            }
        }

        // check for only the land
        int count = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(grid[i][j]==1 && vis[i][j] != true){
                    count++;
                }
            }
        }

        return count;
    }
}