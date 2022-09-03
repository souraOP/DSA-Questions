import java.util.Arrays;
import java.util.Scanner;

public class MultiDarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }
        }
        for(int[] a: arr){
            System.out.println(Arrays.toString(a));
        }
    }
}class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        if(matrix == null || matrix.length == 0) return ans;
        int x = 0, y = 0;
        int row = matrix.length;
        int col = matrix[0].length;
        while (row > 0 && col > 0){
            //Base case for 1 row or 1 col
            if(row == 1){
                for(int i = 0; i < col; i++){
                    ans.add(matrix[x][y]);
                }
                break;
            }else if(col == 1){
                for(int i = 0; i < row; i++){
                    ans.add(matrix[x][y]);
                }
                break;
            }
            //if i have more than 1 row and col
            for(int i = 0; i < col - 1; i++){   //right
                ans.add(matrix[x][y++]);
            }
            for(int i = 0; i < row - 1; i++){   //down
                ans.add(matrix[x++][y]);
            }
            for(int i = 0; i < col - 1; i++){  //left
                ans.add(matrix[x][y--]);
            }
            for(int i = 0; i < row - 1; i++){  //up
                ans.add(matrix[x--][y]);
            }
            x++;
            y++;
            row -= 2;
            col -= 2;
        }
        return ans;
    }
}



