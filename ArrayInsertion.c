#include <stdio.h>
#include<stdlib.h>

void display_array(int arr[], int size_of_array){
   for(int i = 0; i < size_of_array; i++){
      printf("%d ", arr[i]);
   }
   printf("\n");
}

int insert_array(int nums[], int n, int element, int capacity, int index){
   if(n >= capacity) {
      return -1;
   }   
   for (int i = n-1; i >= index ; i--){
      nums[i+1] = nums[i];
   }
   nums[index] = element;
   return 1;
   
}

int main() {
   int nums[100] = {2, 4, 6, 45, 75};   
   int n = 5;
   int element = 34, index;
   printf("At which index should the element be inserted: ");
   scanf("%d", &index);
   insert_array(nums, n, element, 100, index);
   n +=1;
   display_array(nums, n);
   return 0;
}