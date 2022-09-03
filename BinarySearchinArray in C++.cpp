#include <iostream>
using namespace std;

int binarySearch(int arr[], int n , int key)
{
  int startingPoint = 0;
  int endingPoint = n;
  while(startingPoint <= endingPoint)
  {
    int mid = (startingPoint + endingPoint)/2;

    if (arr[mid] == key)
    {
      return mid;
    }
    else if(arr[mid]>key)
    {
      endingPoint = mid-1;
    }
    else
    {
      startingPoint=mid+1;
    }
    
  }
  return -1;
}

int main(){
  int n;
  cout << "Enter the number of elements in the array : ";
  cin >> n;

  int arr[n];
  for (int  i = 0; i < n; i++)
  {
    cin >> arr[i];
  }

  int key;
  cout << "Enter key : ";
  cin >> key;

  cout << binarySearch(arr, n , key)<<endl;
  return 0;
}