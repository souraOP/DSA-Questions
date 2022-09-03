#include <stdio.h>

int main(){
   int n, large, small;
   printf("Enter the size of the array: ");
   scanf("%d", &n);
   int arr[n];
   printf("Enter the elements of the array: ");
   for (int i = 0; i < n; i++) {
      scanf("%d", &arr[i]);
   }
   large = small = arr[0];
   for (int i = 0; i < n; i++)
   {
      if(arr[i]>large) large = arr[i];
      if(arr[i]<small) small = arr[i];
   }
   printf("The smallest element is: %d\n", small);
   printf("The largest element is: %d\n", large);
   return 0;
}