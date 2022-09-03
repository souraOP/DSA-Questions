#include <stdio.h>
#include <string.h>
//Input string/number is palindrome or not
int main()
{
   char S[100];
   int len, temp = 0;
   printf("Enter the string: ");
   gets(S);
   len = strlen(S);
   for (int i = 0; i < len; i++)
   {
      if(S[i] != S[len - i - 1])
         temp = 1;
      break;
   }
   if(temp == 0){
      printf("It is a palindrome!\n");
   }
   else{
      printf("It is NOT a palindrome\n");
   }
   return 0;
}