#include<stdio.h>
#include<stdlib.h>
void insertAtBeginning(int);
void insertAtEnd(int);
void insertAtAfter(int,int);
void deleteBeginning();
void deleteEnd();
void deleteSpecific(int);
void display();

struct Node {
   int data;
   struct Node *next;
}*head = NULL;

int main()
{
   int choice1=0, choice2, value, location, data;
   while(choice1 != 4){
      printf("\n*********** MENU *************\n");
      printf("1. Insert\n2. Delete\n3. Display\n4. Exit\nEnter your choice: ");
      scanf("%d",&choice1);
      switch(choice1)
      {
         case 1:
            while(1){
               printf("\nSelect from the following Inserting options\n");
               printf("1.Add a node\n2. At Beginning\n3. At End\n4. After a Node\nEnter your choice: ");
               scanf("%d",&choice2);
               switch(choice2){
                  case 1:
                     printf("Enter the data: ");
                     scanf("%d", &data);
                     add(data);
                     break;
                  case 2: 	
                     beg_insert();
                     break;
                  case 3:
                     lastinsert();
                  case 4:
                     printf("Enter the value to be inserted: ");
                     scanf("%d",&value);
                     printf("Enter the location after which you want to insert: ");
                     scanf("%d",&location);
                     insertAfter(value, location);
                     break;
                  default:
                     printf("\nPlease select correct Inserting option!!\n");
               }
            }
         case 2:
            while(1){
               printf("\nSelect from the following Deleting options\n");
               printf("1. At Beginning\n2. At End\n3. Specific Node\nEnter your choice: ");
               scanf("%d", &choice2);
               switch(choice2){
                  case 1:
                     begin_delete();
                     break;
                  case 2:
                     last_delete();
                     break;
                  case 3:
                     printf("Enter the Node value to be deleted: ");
                     scanf("%d", &location);
                     random_delete(location);
                     break;
                  default:
                     printf("\nPlease select correct Deleting option!!!\n");
               }
            }
         case 3: 
            display();
         	break;
         case 4: 
            exit(0);
         default:
            printf("\nPlease select correct option!!!");
      }
   }
   return 0;
}

void insertAtBeginning(int value)
{
    struct Node *newNode;
    newNode = (struct Node*)malloc(sizeof(struct Node));
    newNode -> data = value;
    if(head == NULL)
    {
       head = newNode;
       newNode -> next = head;
    }
    else
    {
       struct Node *temp = head;
       while(temp -> next != head)
          temp = temp -> next;
       newNode -> next = head;
       head = newNode;
       temp -> next = head;
    }
    printf("\nInsertion success!!!");
}
void insertAtEnd(int value)
{
   struct Node *newNode;
   newNode = (struct Node*)malloc(sizeof(struct Node));
   newNode -> data = value;
   if(head == NULL)
   {
      head = newNode;
      newNode -> next = head;
   }
   else
   {
      struct Node *temp = head;
      while(temp -> next != head)
         temp = temp -> next;
      temp -> next = newNode;
      newNode -> next = head;
   }
   printf("\nInsertion success!!!");   
}
void insertAfter(int value, int location)
{
   struct Node *newNode;
   newNode = (struct Node*)malloc(sizeof(struct Node));
   newNode -> data = value;
   if(head == NULL)
   {      
      head = newNode;
      newNode -> next = head;
   }
   else
   {
      struct Node *temp = head;
      while(temp -> data != location)
      {
         if(temp -> next == head)
         {
            printf("Given node is not found in the list!!!");
         }
         else
         {
            temp = temp -> next;
         }
      }
      newNode -> next = temp -> next;
      temp -> next = newNode;
      printf("\nInsertion success!!!");
   }
}
void deleteBeginning()
{
   if(head == NULL)
      printf("List is Empty!!! Deletion not possible!!!");
   else
   {
      struct Node *temp = head;
      if(temp -> next == head)
      {
         head = NULL;
         free(temp);
      }
      else{
         head = head -> next;
         free(temp);
      }
      printf("\nDeletion success!!!");
   }
}
void deleteEnd()
{
   if(head == NULL)
      printf("List is Empty!!! Deletion not possible!!!");
   else
   {
      struct Node *temp1 = head, temp2;
      if(temp1 -> next == head)
      {
         head = NULL;
         free(temp1);
      }
      else{
         while(temp1 -> next != head){
            temp2 = temp1;
            temp1 = temp1 -> next;
         }
         temp2 -> next = head;
         free(temp1);
      }
      printf("\nDeletion success!!!");
   }
}
void deleteSpecific(int delValue)
{
   if(head == NULL)
      printf("List is Empty!!! Deletion not possible!!!");
   else
   {
      struct Node *temp1 = head, temp2;
      while(temp1 -> data != delValue)
      {
         if(temp1 -> next == head)
         {
            printf("\nGiven node is not found in the list!!!");
         }
         else
         {
            temp2 = temp1;
            temp1 = temp1 -> next;
         }
      }
      if(temp1 -> next == head){
         head = NULL;
         free(temp1);
      }
      else{
         if(temp1 == head)
         {
            temp2 = head;
            while(temp2 -> next != head)
               temp2 = temp2 -> next;
            head = head -> next;
            temp2 -> next = head;
            free(temp1);
         }
         else
         {
            if(temp1 -> next == head)
            {
               temp2 -> next = head;
            }
            else
            {
               temp2 -> next = temp1 -> next;
            }   
            free(temp1);
         }
      }
      printf("\nDeletion success!!!");
   }
}
void display()
{
   if(head == NULL)
      printf("\nList is Empty!!!");
   else
   {
      struct Node *temp = head;
      printf("\nList elements are: \n");
      while(temp -> next != head)
      {
         printf("%d ---> ",temp -> data);
      }
      printf("%d ---> %d", temp -> data, head -> data);
   }
}