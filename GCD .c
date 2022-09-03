#include <stdio.h>
int gcd(int a, int b) {
   if (a == 0)
      return b;
    else if (b == 0)
        return a;
    while (a != b) {
        if (a > b)
            a = a - b;
        else
            b = b - a;
    }
    return a;
}
int findGCD(int arr[], int n){
   int result = arr[0];
   for (int i = 1; i < n; i++) {
      result = gcd(arr[i], result);
   }
   return result;
}
int main() {
   int n;
   printf("Enter array size: ");
   scanf("%d", &n);
   int arr[n];
   printf("Enter array elements: ");
   for (int i = 0; i < n; i++) {
      scanf("%d", &arr[i]);
   }
   printf("GCD is: %d\n", findGCD(arr, n));
   return 0;
}
