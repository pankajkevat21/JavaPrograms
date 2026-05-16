#include <stdio.h> 
#include <stdlib.h>
struct list {
	int data;
	struct list *next;
	struct list *prev;
};
void display(struct list *p);
void rev(struct list *p);
int main()
{
	struct list *start =NULL, *p = NULL, *node=NULL, *end=NULL;
	int ch,k;
	printf("\nEnter element:");
	scanf("%d", &k);
	while(k!=0)
	{
		node= malloc(sizeof(struct list ));
		node->data = k;
		node->next = NULL;
		if(start==NULL)
		{
			start = node;
			p= node;
		}
		else{
			node->prev =p;
			p->next = node;
			p= node;
		}
		printf("\nEnter element:");
		scanf("%d", &k);
		end = node;
	}
	display(start);
    rev(end) ;
	printf("\ninsertion menu\ninsertion at 1st\n2.any position\n3.at end\n4.display\n5.exit\nEnter your choice:");
	
	printf("\nProgram executed succesffuly");
	return 0;
}
void display(struct list *p)
{
	printf("\nDisplay list:");
	while(p!=NULL)
	{
		printf("%d ",p->data);
		p = p->next;
	}
}
void rev(struct list *p)
{
	printf("\nReverse list:");
	while(p!=NULL)
	{
		printf("%d ",p->data);
		p = p->prev;
	}
}