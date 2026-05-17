#include <stdio.h> 
#include <stdlib.h>
struct list{
	int data;
	struct list *next;
};

int main()
{
	struct list *node=NULL, *p=NULL, *t=NULL,*start =NULL;

	int k;
	int temp;
	printf("\nEnter element:");
	scanf("%d", &k);
	while(k!=0)
	{
        node= (struct list *)malloc(sizeof(struct list));
	    node->next = NULL;
		node->data = k;
		if(start ==NULL)
		{
			start = node;
			p= node;
		}
		else{
			p->next = node;
			p = p->next;

		}
		printf("\nEnter element:");
		scanf("%d", &k);
	}

	p= start;
	while(p!=NULL)
	{
		t= p->next;
		while(t!=NULL)
		{
			if(p->data > t->data)
			{
                         temp = p->data;
						 p->data = t->data;
						 t->data= temp;
			}
			t=t->next;
		}
		p =p->next;
	}
	p=start;
    while(p->next!=NULL)
	{
		printf("%d ",p->data);
		p =p->next;
	}
	printf("\nProgram executed succesffuly");
	return 0;
}