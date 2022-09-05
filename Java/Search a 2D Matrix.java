//Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:

//Integers in each row are sorted from left to right.
//The first integer of each row is greater than the last integer of the previous row.


class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return false;
        }
        int row = matrix.length-1;
        int col = matrix[0].length-1;
        if(target > matrix[row][col] || target < matrix[0][0]) return false;
        
        int x = 0, y = col;
        while(x <= row && y >= 0){
            if(target == matrix[x][y]) return true;
            else if(target < matrix[x][y]){
                y--;
            }
            else{
                x++;
            }
        }
        return false;
    }
}
