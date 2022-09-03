#include <iostream>
#include <climits>
using namespace std;

int main() {
   int a;
   cin >> a;
   int arr[a];
   for (int i = 0; i < a; i++) {
      cin >> arr[i];
   }

   //BRUTE FORCE for finding 
   int maxSum = INT_MIN;
   for (int i=0; i<a; i++) {
      for (int j=i; j<a; j++) {
         int sum=0;
         for (int x=i; x<=j; x++) {
            sum += arr[x];
            //cout << arr[x]<<" ";
         }//cout<< endl;
         maxSum = max(maxSum,sum);
      } 
   }
   cout << maxSum << endl;
   return 0;

   int b;
   cin >> b;
   int arr[b];
   for (int j = 0; j < b; j++)
   {
      cin >> arr[b];
   }
   
}