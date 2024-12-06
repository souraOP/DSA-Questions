class Tri {
    int row;
    int column;
    int step;
    public Tri(int row, int column, int step){
        this.row = row;
        this.column = column;
        this.step = step;
    }
}

class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        // create visited matrix using boolean
        boolean[][] vis = new boolean[n][m];
        //creating the distance matrix
        int[][] distance = new int[n][m]; 
        // make the queue containing row, column and step
        return bfs(distance, vis, n, m, mat);
    }

    private int[][] bfs(int[][] distance, boolean[][] vis, int n, int m, int[][] mat){
        Queue<Tri> q = new LinkedList<Tri>();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                // take only the zeros into the queue and make them true in vis
                if(mat[i][j] == 0){
                    vis[i][j] = true;
                    q.add(new Tri(i, j, 0));
                } else {
                    vis[i][j] = false;
                }
            }
        }
        // take the movements row cols
        int[] dRows = {+1, 0, -1, 0};
        int[] dCols = {0, +1, 0, -1};

        // start the bfs
        while(!q.isEmpty()) {
            int r = q.peek().row;
            int c = q.peek().column;
            int step = q.peek().step;
            // update the distance matrix
            distance[r][c] = step;
            q.remove();
            for(int i = 0; i < 4; i++){
                int nRows = r + dRows[i];
                int nCols = c + dCols[i];

                if(nRows >= 0 && nRows < n && nCols >= 0 && nCols < m && vis[nRows][nCols] == false){
                    vis[nRows][nCols] = true;
                    q.add(new Tri(nRows, nCols, step+1));
                }
            }
        }
        return distance;
    }
}