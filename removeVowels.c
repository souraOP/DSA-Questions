#include<stdio.h>

int checkVowel(char);
int main() {
   char str[50];
   int i=0, j, check;
   printf("Enter a String: ");
   gets(str);
   while(str[i]!='\0') {
      check=0;
      if(checkVowel(str[i])) {
         j=i;
         while(str[j-1]!='\0') {
            str[j] = str[j+1];
            j++;
         }
         check = 1;
      }
      if(check==0)
         i++;
   }
   printf("\nString (without vowels): %s\n", str);
   return 0;
}
int checkVowel(char ch) {
   if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
      ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
      return 1;
   else
      return 0;
}r