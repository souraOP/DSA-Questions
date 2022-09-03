#include <stdio.h>
#include <stdlib.h>
int main() {
    int a[100];
    int element, i, pos, size, n, j, choice, index = -1;
    printf("Enter the size of the array: ");
    scanf("%d", &size);
    printf("Enter the array elements: ");
    for (int i = 0; i < size; i++) {
      scanf("%d", &a[i]);
    }
    printf("Enter choice: \n");
    printf("Press 1 to Inserting an Element in an Array\n");
    printf("Press 2 to Delete an Element in an Array\n");
    printf("Select your choice : ");
    scanf("%d", &choice);
    switch(choice) {
    case 1:
        printf("Array before Insertion: ");
        for(i=0;i<size;i++) {
            printf("%d ",a[i]);
        }
        printf("\nEnter an element to insert\n");
        scanf("%d",&element);
        printf("Enter a position to insert: \n");
        scanf("%d",&pos);
        if(pos <= size && pos >= 0) {
            for(i = size; i > pos; i--)
                a[i] = a[i-1];
            a[pos] = element;
            for(i = 0; i <= size; i++)
                printf("%d ", a[i]);
        } else
            printf("Invalid Position\n");
        printf("\n");
        break;
    case 2:
        printf("Array before deletion\n");
        for(i=0;i<size;i++) {
            printf("%d ",a[i]);
        }
        printf("\nEnter an element to delete\n");
        scanf("%d",&n);
        for(i = 0; i < size; i++) {
            if(a[i] == n){
                index = i;
                break;
            }
        }
        if(index != -1) {
            for(i = index; i < size - 1; i++)
                a[i] = a[i+1];
            printf("New Array : ");
            for(i = 0; i < size - 1; i++)
                printf("%d ",a[i]);
        }else {
            printf("Element not found");
        }
        printf("\n");
        break;
    default:
        printf("Wrong choice, Please try again later");
    }
    return 0;
}