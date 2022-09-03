#include <iostream>
using namespace std;

//CALCULATE THE SUM OF THE ELEMENTS OF A 2D - ARRAY HAVING SAME ORDER.

int main() 
{
  int i,j;      //Variables for entering elements into the matrix
  int matrix_1[3][4],matrix_2[3][4];     //Declaring two 2D array with 3 rows and 4 columns.
  
  cout << "Enter elements in your first 3X4 matrix" << endl;
  for(i=0; i<3; i++)             // i for rows     // i runs from 0 to 2.
  for(j=0; j<4; j++)            // j for columns  // j runs from 0 to 3.
  cin >> matrix_1[i][j];
  
  cout << "Enter elements in your second 3X4 matrix" << endl;
  for(i=0; i<3; i++)            //i for rows      // i runs from 0 to 2.
  for(j=0; j<4; j++)           // j for columns  // j runs from 0 to 3.
  cin >> matrix_2[i][j];


  cout << "This is your first matrix : " << endl;       //DISPLAYING YOUR 1ST MATRIX.
  
  for(i=0; i<3; i++)
  {
    for(j=0; j<4; j++)
    cout << matrix_1[i][j] << "\t";     //its gonna show the elements in the array with some spaces in between them.
    cout << "\n";
  } 
  cout << "This is your second matrix : " << endl;       //DISPLAYING YOUR 2ND MATRIX.

  for(i=0; i<3; i++)                      // creates 3 rows position for establishing the array.
  {
    for(j=0; j<4; j++)                   // creates 4 column position inside of the positions created by the 'i' loop for putting the values of each elements in the matrix

    cout << matrix_2[i][j] << "\t";     // its gonna show the elements in the array with some spaces in between them.
    cout << "\n";                      // enters a new a line for the next row.
  }
  cout << "The sum of your first and second matrix is : " << endl;

  for(i=0; i<3; i++)                    // creates 3 rows position for establishing the array.
  {
    for(j=0; j<4; j++)                  // creates 4 column position inside of the positions created by the 'i' loop for putting the values of each elements in the matrix
    
    cout << (matrix_1[i][j] + matrix_2[i][j]) << "\t";       //adding the arrays to obtain the resultant matrix.
    cout << "\n";                                            // enters a new a line for the next row.
  }
  return 0;

}

