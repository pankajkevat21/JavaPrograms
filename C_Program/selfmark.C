#include <stdio.h> 
#include <stdlib.h>
struct marksheet {
    int roll;
    char name[20];
    int m1, m2, m3;
    struct marksheet *next;
};

int main()
{
  struct marksheet *node =NULL, *t=NULL, *head =NULL;
    float percentage;
  int i,n;
 int total=0;  
  printf("\nhow many students:");
  scanf("%d", &n);
  for(i=0;i<n;i++)
  {
    node = (struct marksheet *)malloc(sizeof(struct marksheet));
    node->next = NULL;
    printf("\nEnter roll no:");
    scanf("%d", &node->roll);
    printf("\nEnter Name:");
    scanf("%s", node->name);
    printf("\nEnter marks m1:");
    scanf("%d", &node->m1);
    printf("\nEnter marks m2:");
    scanf("%d", &node->m2);
    printf("\nEnter marks m3:");
    scanf("%d", &node->m3);
   total = total+node->m1+node->m2+node->m3;
    if(head==NULL)
    {
        head = node;
        t = node;
    }
    else
    {
         t->next = node;
         t= t->next;
    }
  }

  printf("\n*****Marksheet****\n");
  t = head;
  while(t!=NULL)
  {
  int sum = t->m1 + t->m2 + t->m3;
    float avg;

    avg = (float)sum / 3;

    printf("\nRoll: %d", t->roll);
    printf("\nName: %s", t->name);
    printf("\nTotal Marks: %d", sum);
    printf("\nAverage Marks: %.2f\n", avg);

    t = t->next;}
      
      printf("\nProgram executed succesffuly");
    return 0;
}