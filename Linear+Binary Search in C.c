#include <stdio.h>
#include <stdbool.h>
int binarySearch(int *, int, int, int);
int linearSearch(int *, int, int);
int main() {
   int n, choice, target, index;
   printf("Enter the size of the array: ");
   scanf("%d", &n);
   int arr[n];
   printf("Enter the elements of the array: ");
   for (int i = 0; i < n; i++) {
      scanf("%d", &arr[i]);
   }
   printf("Enter the target element: ");
   scanf("%d", &target);
   printf("\nPress 1 to perform Linear Search\n");
   printf("\nPress 2 to perform Binary Search\n");
   scanf("%d", &choice);
   switch (choice) {
   case 1:
      index = linearSearch(arr, target, n);
      if(index == -1){
         printf("Element not found\n");
      } else{
         printf("The element %d is present & is at position: %d\n", target, index);
      }
      break;
   case 2:
      index = binarySearch(arr, target, 0, n);
      if(index == -1){
         printf("Element not found\n");
      } else{
         printf("The element %d is present & is at position: %d\n", target, index);
      }
      break;
   default:
      printf("\nInvalid Choice! Try Again\n");
      break;
   }
   return 0;
}
int linearSearch(int arr[], int target, int n){
   for (int i = 0; i < n; i++){
      if(arr[i] == target){
         return i+1;
      }
   }
   return -1;
}
int binarySearch(int arr[], int target, int start, int end){
   bool isAsc = arr[start] < arr[end];
   if(start > end){
      return -1;
   }
   int mid = start + (end - start)/2;

   if(arr[mid] == target) return mid+1;

   if(isAsc){
      if(target < arr[mid]){
         return binarySearch(arr, target, start, mid - 1);
      }else {
         return binarySearch(arr, target, mid + 1, end);
      }
   } else {
      if(target < arr[mid]){
         return binarySearch(arr, target, mid + 1, end);
      } else {
         return binarySearch(arr, target, start, mid - 1);
      }
   }
}
