#include <stdio.h>
#include <math.h>

int main()
{
   int n;
   float arr[100], mean, variance, standard_deviation;
   float sum = 0, sum1 = 0;
   scanf("%d", &n);
   for (int i = 0; i < n; i++) {
      scanf("%f", &arr[i]);
      sum += arr[i];
   }
   mean = sum/(float)n;
   printf("\nThe mean is: %0.2f\n", mean);
   for (int i = 0; i < n; i++) {
      sum1 += (mean - arr[i])*(mean - arr[i]);
   }
   variance = sum1 / (float)n;
   printf("The Variance is: %0.2f\n", variance);
   standard_deviation = sqrt(variance);
   printf("The Standard Deviation is: %0.2f\n", standard_deviation);
   return 0;
}