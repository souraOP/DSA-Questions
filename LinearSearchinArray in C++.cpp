#include <iostream>
using namespace std;

int linearSearch(int array[], int n, int key){               //TIME COMPLEXITY ---> O(n)
  for (int i = 0; i < n; i++)
  {
    if (array[i]==key){
      cout << "Your key is in index : ";
      return i;
    }
  }
  return -1;
  
}

int main() {
  int n;
  cout << "Enter the number of elements in our array : ";
  cin >> n;

  int array[n];
  for (int i = 0; i < n; i++)
  {
    cin >> array[i];
  }
  int key;
  cout << "Enter your key : ";
  cin >> key;

  cout << linearSearch(array,n,key)<<endl;
   
  return 0;
}