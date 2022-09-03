#include<stdio.h>

void display_Array(int arr[], int n);
void display_Array(int arr[], int n){
   for (int i = 0; i < n; i++)
   {
      printf("%d ", arr[i]);
   }
   
}

void ArrayDeletion(int arr[], int n, int index){
   for (int i = index; i < n-1; i++)
   {
      arr[i] = arr[i+1];
   }
   
}

int main(){
   int arr[100] = {6, 2, 5, 21, 65, 77};
   int n = 6;
   int index;
   printf("Enter array to be deleted: ");
   scanf("%d", &index);
   printf("Before Array: ");
   display_Array(arr, n);
   printf("\n");
   ArrayDeletion(arr, n, index);
   printf("After Array: ");
   display_Array(arr, n);
   return 0;
}