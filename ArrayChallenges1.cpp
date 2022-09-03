// MAX TILL i : Given an array a[] of size of n. For every i from n-1 output max(a[0],a[1],....,a[i]). 
// Time complexity - O(n)
#include <iostream>
using namespace std;

int main() {
  int n;
  cout << "Enter size of array :";
  cin >> n;
  int mx = -19999999;
  int arr[n];
  cout << "Enter your array :";
  for (int i = 0; i < n; i++)
  {
    cin >> arr[i];
  }
  for (int i = 0; i < n; i++)
  {
    mx = max(mx, arr[i]);
    cout << mx << endl;
  }

  cout <<
  

  
  return 0;
}