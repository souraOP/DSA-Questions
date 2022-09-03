#include <stdio.h>
#include <stdlib.h>
//function to ADD two Matrix.
void addMatrix(int a[10][10], int b[10][10], int sum[10][10], int row, int column) {
	for (int i = 0; i < row; ++i) {
		for (int j = 0; j < column; ++j) {
			sum[i][j] = a[i][j] + b[i][j];
		}
	}
}
//function to MULTIPLY two Matrix.
void multiplyMatrix(int a[10][10], int c[10][10], int multiply[10][10], int row, int row1, int column1) {
	int sum = 0;
	for (int i = 0; i < row; ++i) {
		for (int j = 0; j < column1; ++j) {
			for (int k = 0; k < row1; ++k) {
				sum = sum + a[i][k]*c[k][j];
			}
			multiply[i][j] = sum;
			sum = 0;
		}
	}
}
//function to DISPLAY the Matrix.
void displayMatrix(int matrix[10][10], int row, int column) {
   	for (int i = 0; i < row; ++i) {
      	for (int j = 0; j < column; ++j) {
      		printf("%d\t", matrix[i][j]);
        	if (j == column - 1)
        		printf("\n");
      }
   }
}
int main() {
	int row, column, row1, column1, first[10][10], second[10][10], result[10][10] ;
	int choice;
	printf("Enter the number of rows and column of first matrix (between 1 and 10): ");
	scanf("%d%d", &row, &column);
//Taking input for our First Matrix.
	printf("\nEnter elements of the first matrix:\n");
	for (int i = 0; i < row; ++i) {
		for (int j = 0; j < column; ++j) {
			printf("Enter elements at a%d%d: ", i+1, j+1);
			scanf("%d", &first[i][j]);
		}
	}
//Taking input for our Second Matrix.
	printf("\nEnter the number of rows and column of second matrix (between 1 and 10): ");
	scanf("%d%d", &row1, &column1);
	while (column != row1) {
      	printf("\nWARNING !, MATRIX CANNOT BE MULTIPLIED ! SINCE, ROW OF 1ST MATRIX IS NOT EQUALS TO THE COLUMN OF 2ND MATRIX\n");
      	break;
    }
	printf("\nEnter elements of the second matrix:\n");
	for (int p = 0; p < row1; ++p) {
		for (int q = 0; q < column1; ++q) {
			printf("Enter elements at b%d%d: ", p+1, q+1);
			scanf("%d", &second[p][q]);
		}
	}
	do {
// menu to choose the operation
    printf("\nChoose the matrix operation,\n");
    printf("----------------------------\n");
    printf("1. Addition\n");
    printf("2. Multiplication\n");
    printf("3. Exit\n");
    printf("----------------------------\n");
    printf("Enter your choice: ");
    scanf("%d", &choice);
    switch (choice) {
      case 1:
        addMatrix(first, second, result, row, column);
        printf("Sum of matrix: \n");
        displayMatrix(result, row, column1);
        break;
      case 2:
      	if (column != row1) {
      		printf("\nMatrix can't be multiplied!\n");
      	}
      	else {
      		multiplyMatrix(first, second, result, row, row1, column1);
        	printf("Multiplication of matrix: \n");
        	displayMatrix(result, row1, column1);
      	}
      	break;
      case 3:
        printf("Thank You.\n");
        exit(0);
      default:
        printf("Invalid input.\n");
        printf("Please enter the correct input.\n");
    }
  } while(1);
	return 0;
}


