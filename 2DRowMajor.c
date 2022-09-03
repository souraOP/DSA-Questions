#include <stdio.h>
int main() {
   int n,m;
   printf("Enter the row and column: ");
   scanf("%d %d", &n, &m);
   int arr[n][m];
   printf("Enter the elements of the 2D Array: \n");
   for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
         printf("Enter at a[%d][%d]: ", i,j);
         scanf("%d", &arr[i][j]);
      }
   }
   printf("\nThe 2D Array is: \n");
   for (int i = 0; i < n; i++) {
      printf("\n");
      for (int j = 0; j < m; j++) {
         printf("%d\t", arr[i][j]);
      }
   }
   printf("\n\n2D array in Row Major Order: \n\n");
   for (int i = 0; i < n; i++){
      for (int j = 0; j < m; j++) {
         printf("%d ", arr[i][j]);
      }
   }
   printf("\n");
   return 0;
}