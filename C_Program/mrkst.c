#include <stdio.h> 
#include <stdlib.h>
st
ruct marksheet{
    int roll_no;
    int m1, m2 , m3;
    int total;
    char name[20];
    char subject[20];
    float percentage;
    struct marksheet *next;
};
int main()
{
  struct marksheet *node=NULL, *head = NULL, *temp =NULL;
  for(int i=0; i<1;i++)  
  {
    node = (struct marksheet*)malloc(sizeof(struct marksheet));
    printf("\nEnter roll no.");
    scanf("%d", &node->roll_no);
    printf("\nEnter name:");
    scanf("%s",node->name);
        printf("\nEnter 3 subject numbers:");
        scanf("%d %d %d", &node->m1, &node->m2, &node->m3);
        node->total = node->m1+node->m2+node->m3;
        node->percentage = node->total /3.0;
        node->next =NULL;
        if(head==NULL)
        {
            head  = node;
            temp = node;
        }
        else{
             temp->next = node;
             temp = node;
        }

  }
  printf("\n------MARKSHEET------");
  temp = head;
  while(temp!=NULL)
  {
     printf("\nroll no:%d",temp->roll_no);
     printf("\nName:%s",temp->name);
     printf("\nmarks :%d %d %d",temp->m1, temp->m2, temp->m3);
     printf("\ntotal marks:%d",temp->total);
     printf("\npercentage: %.2f", temp->percentage);
     temp = temp->next;
  }
    printf("\nProgram executed succesffuly");
    return 0;
}