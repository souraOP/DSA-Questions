#include <stdio.h>

int main()
{
    int n;
    printf("Enter the number of elements: ");
    scanf("%d",&n);
    printf("Enter the array elements: ");
    int a[n];                    //Array Declaration
    for(int i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    for(int i=0;i<n;i++)         //Sorting Array
    {
        for(int j=i+1; j<n ;j++)
        {
            if(a[i]<a[j])
            {
                a[i] = a[i] ^ a[j];
                a[j] = a[i] ^ a[j];
                a[i] = a[i] ^ a[j];
            }
        }
    }
    printf("The second smallest element is %d\n",a[n-2]);   //Accessing the smallest element
    printf("The second largest element is %d\n",a[1]);      //Accessing the largest element
    return 0;
}