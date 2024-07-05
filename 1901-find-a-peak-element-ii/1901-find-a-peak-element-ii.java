class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int n = mat.length, m = mat[0].length;
        int start = 0, end = m - 1;
        while(start <= end) {
            int mid = start + (end - start)/2;
            // getting the maximum row value
            int maxRowIndex = findMaxColumnValue(mat, m, n, mid);
            int left = mid - 1 >= 0 ? mat[maxRowIndex][mid - 1] : -1;
            int right = mid + 1 < m ? mat[maxRowIndex][mid + 1] : -1;
            // if both of them are greater than right and left
            if(mat[maxRowIndex][mid] > left && mat[maxRowIndex][mid] > right) {
                return new int[] {maxRowIndex, mid};
            } else if (mat[maxRowIndex][mid] < left) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return new int[] {-1, -1};
    }
    
    public static int findMaxColumnValue(int[][] mat, int m, int n, int col) {
        int maxValue = -1;
        int index = -1;
        for(int i = 0; i < n; i++) {
            if(mat[i][col] > maxValue) {
                maxValue = mat[i][col];
                index = i;
            }
        }
        return index;
    }
}