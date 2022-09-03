#include <iostream>
using namespace std;

int main() {
  int n;
  cout << "Enter no. of elements : ";
  cin>>n;
  int arr[n];
  cout << "Enter your array : ";
  for (int i = 0; i < n; i++)
  {
    cin >> arr[i];
  }
  
  for (int i = 0; i < n-1; i++)
  {
    for (int j = i; j < n; j++)
    {
      if(arr[j]<arr[i]){
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
      }
    }
  }
  cout << "Array in ascending order : ";

  for (int i = 0; i < n; i++)
  {
    cout << arr[i] << " ";
  }cout << endl;
  
  return 0;
}