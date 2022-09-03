#include <stdio.h>
//saddle point is the minimum or smallest element row-wise and maximum element column wise.

int main()
{
   int a[10][10], i, j, k, min, n, m, col_index, row_index, flag = 1;
   printf("Input size of the matrix: ");
   scanf("%d%d", &n, &m);
   printf("Enter elements of the matrix: ");
   for (i = 0; i < n; i++) {
      for ( j = 0; j < m; j++) {
         scanf("%d", &a[i][j]);
      }
   }
   //find the minimum in each row
   for ( i = 0; i < n; i++) {
      min = a[i][0];
      col_index = 0;
      row_index = 0;
      for ( j = 0; j < n; j++) {
         if(a[i][j] < min) {
            min = a[i][j];
            row_index = i;
            col_index = j;
         }
      }
      for(k = 0; k < m; k++){
         if(j != col_index){
            if(a[j][col_index] > a[row_index][col_index])
               flag = 0;
         }
      }
      if(flag)
         printf("Saddle point at a[%d][%d] = %d\n", row_index+1, col_index+1, a[row_index][col_index]);
      else
         printf("No saddle point in row %d\n", i+1);
      flag = 1;
   }
   return 0;
}
