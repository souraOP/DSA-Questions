class Solution {
    public int[][] generateMatrix(int n) {
        if(n == 0){
            return new int[0][0];
        }
        int[][] spiralMatrix = new int[n][n];
        int value = 1;
        int left= 0, right = n - 1, top = 0, bottom = n -1;
        while(left <= right && top <= bottom){
            //fill in the top row
            for(int column = left; column <= right; column++){
                spiralMatrix[top][column] = value++;
            }
            top++; //putting our top pointer down
            
            // fill in the right column
            for(int row = top; row <= bottom; row++){
                spiralMatrix[row][right] = value++;
            }
            right--;
            
            //fill in the bottom row (reverse order)
            if(top <= bottom){
                for(int column = right; column >= left; column--){
                    spiralMatrix[bottom][column] = value++;
                }
                bottom--;
            }
            
            
            //fill in the left column (reverse order)
            if(left <= right){
                for(int row = bottom; row >= top; row--){
                    spiralMatrix[row][left] = value++;
                }
                left++;
            }
            
        }
        return spiralMatrix;
        
    }
}