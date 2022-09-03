#include <iostream>
#include <climits>
using namespace std;

int main() {
  int m;
  cout << "Enter the number of elements in the array : ";
  cin>>m;
  int arr[m];

  for (int i = 0; i < m; i++)
  {
    cin >> arr[i];
  }

  int maximumNumber = INT_MIN;
  int minimumNumber = INT_MAX; 

  for (int i = 0; i < m; i++)
  {
    maximumNumber = max(maximumNumber,arr[i]);
    minimumNumber = min(minimumNumber,arr[i]);
  }
  cout << "Maximum Number is : " << maximumNumber << endl;
  cout << "Minimum Number is : " << minimumNumber << endl;
  
  
  return 0;
}