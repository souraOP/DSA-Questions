#include <stdio.h>
#include <stdlib.h>
struct souraArray
{
   int fullSize;
   int usedSize;
   int *ptr;
}population;
void createArray(struct souraArray *a, int tSize, int uSize){
   a->fullSize = tSize;
   a->usedSize = uSize;
   a->ptr = (int *)malloc(tSize * sizeof(int));
}
void setVal(struct souraArray *a){
   int n;
   for(int i = 0; i < a->usedSize; i++){
      printf("Enter elements at %d position", i);
      scanf("%d", &n);
      (a->ptr)[i] = n;
   }
}
void showVal(struct souraArray *a){
   for(int i = 0; i < a->usedSize; i++){
      printf("%d\n", (a->ptr)[i]);
   }
}
int main(){
   createArray(&population, 10, 3);
   printf("Set Value\n");
   setVal(&population);
   printf("Show Value\n");
   showVal(&population);
}