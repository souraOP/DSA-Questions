class Pair {
    int row;
    int column;
    int time;

    Pair(int row, int column, int time) {
        this.row = row;
        this.column = column;
        this.time = time;
    }
}

class Solution {
    public int orangesRotting(int[][] grid) {
        // base check
        if (grid.length == 0 || grid[0].length == 0) {
            return -1;
        }

        // get the row and column
        int r = grid.length;
        int c = grid[0].length;

        // make a queue storing row, col, time
        Queue<Pair> q = new LinkedList<>();
        // make the visited matrix 2d
        int[][] vis = new int[r][c];

        // next is iterate through the grid matrix and put all the rotten oranges into
        // the queue and mark them on the visited matrix
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (grid[i][j] == 2) {
                    // add the 0 time since its the very first oranges
                    q.add(new Pair(i, j, 0));
                    // mark them in the visited matrix
                    vis[i][j] = 2;

                } else {
                    vis[i][j] = 0;
                }
            }
        }

        int timeTaken = 0;
        // just like W,A,S,D
        int[] moveRows = { -1, 0, +1, 0 };
        int[] moveCols = { 0, 1, 0, -1 };

        // write the bfs
        while (!q.isEmpty()) {
            int getRow = q.peek().row;
            int getColumn = q.peek().column;
            int getTime = q.peek().time;

            timeTaken = Math.max(getTime, timeTaken);
            q.remove();

            // after that we have to check the neighbours
            // so just iterate through the 4 directions
            for (int i = 0; i < 4; i++) {
                int nRow = getRow + moveRows[i]; // coordinate x
                int nCol = getColumn + moveCols[i]; // coordinate y

                // oranges not rotten and they be fresh then make em' rotten
                // fuck you nigga
                if(nRow >= 0 && nRow < r && nCol >= 0 && nCol < c && vis[nRow][nCol] == 0 && grid[nRow][nCol] == 1) {
                    // push em to da queue
                    q.add(new Pair(nRow, nCol, timeTaken + 1));
                    // make the visited matrix as rotten in their places
                    vis[nRow][nCol] = 2;

                }
            }

        }
        // if there are any fresh oranges left then return -1
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (vis[i][j] != 2 && grid[i][j] == 1) {
                    return -1;
                }
            }
        }

        return timeTaken;

    }
}