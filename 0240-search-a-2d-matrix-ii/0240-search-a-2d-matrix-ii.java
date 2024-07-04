class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // for(int i = 0; i < matrix.length; i++) {
        //     for(int j = 0; j < matrix[i].length; j++) {
        //         if(matrix[i][j] == target) {
        //             return true;
        //         }
        //     }
        // }
        // return false;
        if(matrix.length == 0 || matrix == null || matrix.length < 1 || matrix[0].length < 1) {
            return false;
        }
        
        int col = matrix[0].length - 1;
        int row = 0;
        while(col >= 0 && row <= matrix.length - 1) {
            if(matrix[row][col] == target) {
                return true;
            }
            else if (target < matrix[row][col]) {
                col--;
            } else {
                row++;
            }
        }
        return false;
    }
}   