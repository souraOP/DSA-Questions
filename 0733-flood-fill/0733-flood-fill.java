class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        // take the initial colour
        int initialColour = image[sr][sc];
        //make a new image matrix and store it in a variable
        int[][] tempImage = image;
        int[] moveRows = {+1, 0, -1, 0};
        int[] moveCols = {0, -1, 0, +1};
        dfs(sr, sc, tempImage, initialColour, image, moveRows, moveCols, color);
        return tempImage;
    }

    private void dfs(int r, int c, int[][] temp, int ini, int[][] image, int[] mrow, int[] mcols, int color){
        temp[r][c] = color;
        int n = image.length;
        int m = image[0].length;
        // get the neighbours by moving in adjacent distances
        for(int i = 0; i<4;i++){
            int nRows=r + mrow[i];
            int nCols = c + mcols[i];
            //check for same colour and also check if it's already coloured or not
            if(nRows >= 0 && nRows < n && nCols >= 0 && nCols < m && image[nRows][nCols] == ini && temp[nRows][nCols] != color ){
                dfs(nRows, nCols, temp, ini, image, mrow, mcols, color);
            }
        }
    }
}