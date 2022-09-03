#include <stdio.h>
#include <math.h>
#include <string.h>
#include <stdbool.h>

bool checkAP(double arr[], int n){
   //This is the BASE CASE
	if(n == 1)
		return true;
	//sort the array
	qsort(arr, arr+n);
   double d = arr[1]-arr[0];
   for (int i = 2; i < n; i++)
   {
      if (arr[i] - arr[i-1] != d)
      {
         return false;
      }
      return true;  
   }
   
   
}

bool checkGP(double arr[], int n){
   //Base CASE
   if(n == 1)
      return true;
   qsort(arr, arr+n);
   double r = arr[1]/arr[0];
   for (int i = 2; i < n; i++)
   {
      if(arr[i] / arr[i-1] != r){
            return false;
      }
      return true;
   }
}

bool checkHP(double arr[], int n){
   //Base case
   if(n == 1){
      return true;
   }
   double reci[n];
   for (int i = 0; i < n; i++)
   {
      reci[i] = ((1/arr[i]));
   }
   if (checkAP(reci, n)){
      return true;
   }
   else{
      return false;
   }
}

int main()
{
	int a[5];
	printf("enter the series :\n");
	for(int i=0;i<5;i++)
	{
		scanf("%d", &a[i]);
	}
   double x = sizeof(a)/sizeof(a[0]);
   int flag = 0;
   //function to check AP
   if(checkAP(a, x)){
      printf("It's an AP\n");
      int cd = a[1] - a[0];
      printf(arr[0] + (arr[5] - 1)*cd);
      flag = 1;
   }
   if(checkGP(a[], x)){
      printf("It's an GP\n");
      int cr = a[1]/a[0];
      printf(a[0] * (int)(pow(cr, a[4]-1)));
      flag = 1;
   }
   if(checkHP(a, x)){
      printf("It's an HP\n");
      flag = 1;
   }
   else if(flag == 0){
      printf("\nNothing can be formed from this series\n");
   }
   return 0;
} 
