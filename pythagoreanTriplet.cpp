#include<bits/stdc++.h>
using namespace std;

int check(int a, int b, int c)
{
  int big=max(a, max(b,c));
  int sum = a*a+ b*b + c*c - big*big;
  if (sum==(big*big))
    return 1;
  return 0;
}

int32_t main(){
  int x,y,z;
  cin>>x>>y>>z;

  if(check(x,y,z))
  {
    cout<<"pythagorean triplet";
  }
  else
  {
    cout<<"not a pythagorean triplet";
  }
  
}