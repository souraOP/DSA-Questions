#include <stdio.h>
#include <string.h>
//Write C programs to sort an input string in alphabetical ascending order
char string[100];
void orderString(){
   int i, j;
   char temp;
   int lengthOfString = strlen(string);
   for (int i = 0; i < lengthOfString-1; i++)
   {
      for (int j = i+1; j < lengthOfString; j++)
      {
         if(string[i]>string[j]){
            temp = string[i];
            string[i] = string[j];
            string[j] = temp;
         }
      }
   }
}
int main()
{
   printf("Enter the string: ");
   gets(string);
   orderString();
   puts(string);
   return 0;
}