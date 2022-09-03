#include <iostream>
using namespace std;

int main() {
  int n;
  cout << "Enter no. of elements in array : ";
  cin >> n;
  int arr[n];
  for (int i = 0; i < n; i++)
  {
    cin >> arr[i];
  }

  for (int i = 1; i < n; i++)     //When we read the first item we assume that it is in the correct position bcoz there is no other item to compare this item to.
  {
    int current = arr[i];
    int j = i-1;
    while (arr[j]>current && j>=0)
    {
      arr[j+1]=arr[j];
      j--;
    }
    arr[j+1]=current;
  }
  for (int i = 0; i < n; i++)
  {
    cout << arr[i] << " ";
  }cout << endl;
  

̐ 
  
  return 0;
}