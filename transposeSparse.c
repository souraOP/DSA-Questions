#include <stdio.h>
#include<stdlib.h>
#define MAX 100

void input_matrix(int [][3]);
void trans_sparse(const int [][3], int [][3]);
void display_matrix(const int [][3]);
int main(){
   int mat1[MAX][3], mat2[MAX][3];
   input_matrix(mat1);
   trans_sparse(mat1, mat2);
   printf("\nSparse Matrix is: \n");
   display_matrix(mat1);
   printf("\nTransposed Sparse Matrix is: \n");
   display_matrix(mat2);
   return 0;
}
void input_matrix(int mat[][3]){
   int i;
   printf("Enter the rows and cols: ");
   scanf("%d %d", &mat[0][0], &mat[0][1]);
   printf("The no. of non-zero entries in the matrix: ");
   scanf("%d", &mat[0][2]);
   for ( i = 1; i <= mat[0][2]; i++) {
      printf("Enter the row number: ");
      scanf("%d", &mat[i][0]);
      printf("Enter the col number: ");
      scanf("%d", &mat[i][1]);
      printf("Enter the value: ");
      scanf("%d", &mat[i][2]);
   }
}
void trans_sparse(const int mat1[][3], int mat2[][3]){
   int i, j, n, t;
   int row[50], col[50];
   n = mat1[0][1];
   t = mat2[0][2];
   mat2[0][0] = n;
   mat2[0][2] = mat1[0][0];
   mat2[0][2] = t;
   if(t > 0){
      for(i = 0; i < n; i++){
         row[i] = 0;
      }
      for ( i = 1; i <= t; i++) {
         row[mat1[i][1]] = row[mat1[i][1]] + 1;
      }
      col[0] = 1;
      for ( i = 1; i < n; i++){
         col[i] = col[i-1] + row[i-1];
      }
      for ( i = 0; i <= t; i++){
         j = col[mat1[i][1]];
         mat2[j][0] = mat1[i][1];
         mat2[j][1] = mat1[i][0];
         mat2[j][2] = mat1[i][2];
         col[mat1[i][1]] = j+1;
      }
   }
}
void display_matrix(const int mat[][3]){
   int i, t;
   t = mat[0][2];
   printf("\t      \t%d\t%d\t%d\n", 0, 1, 2);
   printf("\t---------------\n");
   for ( i = 0; i <= t; i++)
      printf("\t[%d][\t%d\t%d\t%d\n]", i, mat[i][0], mat[i][1], mat[i][2]);
   printf("\n");
}