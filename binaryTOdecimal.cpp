#include <bits/stdc++.h>  
using namespace std;

int bintodeci(int n)
{ 
  int tl=0;
  int uq=1;
  while(n!=0)
  {
    int x=n%10;   //gets the last digit of the binary number.
    tl+=x*uq;     //traversing and adding to get the decimal value.
    uq*=2;        //power of 2.
    n/=10;        //
  }
  return tl;
}

int32_t main()
{
  int n;
  cin>>n;

  cout<<bintodeci(n)<<endl;
  
}