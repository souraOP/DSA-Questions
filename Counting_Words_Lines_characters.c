#include <stdio.h>
int main() {
   char str[200];
   int line, word, ch;
   line = word = ch = 0;
   printf("Enter string: (terminate with ~): \n");
   scanf("%[^~]", str); //reading multiline string
   for (int i = 0; str[i] != '\0'; i++) {  //checking every character
      if (str[i] == '\n') {   /*if it is a newline then one line one word completed*/
         line++;
         word++;
      }
      else{
         if (str[i] == ' ' || str[i] == '\t') {
            word++;
            ch++;
         }
         else {
            ch++;
         }
      }
   }
   printf("\nCharacter counts = %d\n", ch);
   printf("Word counts = %d\n", word);
   printf("Line counts = %d\n", line);
   return 0;
}