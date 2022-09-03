#include <stdio.h>
int main(){
   int i, j, row, col, count = 0, size = 0, k = 0;
   printf("Enter the row and col: ");
   scanf("%d %d", &row, &col);
   int arr[row][col];
   printf("Enter the elements of the matrix\n");
   for ( i = 0; i < row; i++) {
      for ( j = 0; j < col; j++){
         printf("Enter element a[%d][%d]: ", i, j);
         scanf("%d", &arr[i][j]);
      }
   }
   for ( i = 0; i < row; i++) {
      for ( j = 0; j < col; j++) {
         if(arr[i][j] == 0){
            ++count;
         }
      }
   }
   if(count > (row*col)/2){
      printf("\nIt is a sparse matrix\n");
   } else {
      printf("\nIt is not a sparse matrix\n");
   }
   for ( i = 0; i < row; i++) {
      for ( j = 0; j < col; j++) {
         if(arr[i][j] != 0){
            size++;
         }
      }
   }
   int smatrix[3][size];
   for ( i = 0; i < row; i++) {
      for ( j = 0; j < col; j++) {
         if(arr[i][j] != 0){
            smatrix[0][k] = i;
            smatrix[1][k] = j;
            smatrix[2][k] = arr[i][j];
            k++;
         }
      }
   }
   printf("3-tuple format: \n");
   for ( i = 0; i < 3; i++)
   {
      for ( j = 0; j < size; j++)
         printf("%d ", smatrix[i][j]);
      printf("\n\n");
   }
   
   return 0;
}