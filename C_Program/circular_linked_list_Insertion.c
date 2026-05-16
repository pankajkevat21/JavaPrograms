#include <stdio.h> 
#include <stdlib.h>
struct list {
	int data;
	struct list *next;
};
void display(struct list *start);

int main()
{
	struct list *start=NULL,*node =NULL, *p=NULL;
	int k,pos,i,ch;
	printf("\nEnter element:");
	scanf("%d", &k);
	while(k!=0)
	{
		node = (struct list*)malloc(sizeof(struct list));
		node->data = k;
		node->next =NULL;

		if(start==NULL)
		{
			start = node;
			node->next = start;
			p= start;
		}
		else
		{
			p->next = node;
			p= node;
			p->next = start;
		}
		printf("\nEnter element:");
		scanf("%d", &k);

	}
	p= start;
display(p)	;

while(1){
	printf("\ninsertion operations");
	printf("\n1.first\n2.anywhere\n3.end\n4.display\n5.exit\nEnter your choice:");
	scanf("%d", &ch);
	switch(ch)
	{
	      case 1: printf("\nEnter element:");	
		          node = (struct list*)malloc(sizeof(struct list));
				  node->next = NULL;
				  scanf("%d", &node->data);
				  p= start;
				  while(p->next!=start)
				   p=p->next;
				  node->next = start;
				  start = node;
				  p->next = start;
				  p=start;
				  break;
		case 2:     printf("\nEnter position where you want to add node:");
		             scanf("%d", &pos);
					 printf("\nEnter value:");
		          node = (struct list*)malloc(sizeof(struct list));
				  scanf("%d", &node->data);
				  node->next = NULL;
				  i=1;
				  p=start;
				  while(i<pos-1 && p->next!=start)
				   {
					i++;
					p = p->next;
				   }
				   node->next = p->next;
				   p->next = node;
				   p=start;
				   display(p);
				   break;
		case 3: printf("\nEnter element:");
		        node =(struct list*)malloc(sizeof(struct list));
		        scanf("%d", &node->data);
				node->next = NULL;
				p = start;
				while(p->next!=start)
				{
					p= p->next;
				}
				node->next = p->next;
				p->next = node;
				p= start;
				display(p);
		case 5: exit(0);
		       
		case 4: p= start;
		display(p);
		         break;

	}
}
	printf("\nProgram executed succesffuly");
	return 0;
}
void display(struct list *start)
{
       struct list *p =start;
	   do{
		printf("%d ",p->data);
		p= p->next;
	   }while(p!=start);
}