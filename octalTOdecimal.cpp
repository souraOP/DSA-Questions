#include<bits/stdc++.h>
using namespace std;

int octtodeci(int n)
{ 
  int y=0;
  int q=1;
  while(n>0)
  {
    int x=n%10;
    y+=x*q;
    q=q*8;
    n/=10;
  }
  return y;
}

int32_t main()
{
  int n;
  cin>>n;
  cout<<octtodeci(n)<<endl;
}
