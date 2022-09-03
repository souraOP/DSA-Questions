#include <stdio.h>
int fibo(int x){
   if(x == 0)
      return 0;
   else if (x == 1)
      return 1;
   else  
      return (fibo(x - 1) + fibo(x - 2));
}
int main()
{
   int n;
   printf("Enter the nth term of the series: ");
   scanf("%d", &n);
   printf("Fibonacci Series is: \n");
   for (int i = 0; i < n; i++) {
      printf("%d ", fibo(i));
   }
   printf("\n");
   return 0;
}