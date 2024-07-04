/* Given a boolean 2D array of n x m dimensions, consisting of only 1's and 0's, where each row is sorted. Find the 0-based index of the first row that has the maximum number of 1's. Return the 0-based index of the first row that has the most number of 1s. If no such row exists, return -1.

Examples :

Input: n = 4, m = 4, arr[][] = [[0, 1, 1, 1],[0, 0, 1, 1],[1, 1, 1, 1],[0, 0, 0, 0]]
Output: 2
Explanation: Row 2 contains 4 1's (0-based indexing).

Input: n = 2, m = 2, arr[][] = [[0, 0], [1, 1]]
Output: 1
Explanation: Row 1 contains 2 1's (0-based indexing).
 

Expected Time Complexity: O(n+m)
Expected Auxiliary Space: O(1)


Constraints:
1 ≤ n, m ≤ 103
0 ≤ arr[i][j] ≤ 1 
*/


class Solution {
    int rowWithMax1s(int arr[][], int n, int m) {
        // code here
        int index= -1, cnt = 0;
        for(int i = 0; i < n; i++) {
            int cntOnes = 0;
            for(int j = 0; j < m; j++) {
                if(arr[i][j] == 1) {
                    cntOnes++;
                }
            }
            if(cnt < cntOnes) {
                cnt = Math.max(cntOnes, cnt);
                index = i;
            }
        }
        return index;
    }
}
