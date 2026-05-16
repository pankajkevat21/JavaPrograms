#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
struct list
{
	int data;
	struct list *next;
	struct list *prev;
};
void display(struct list *p);
int main()
{
	struct list *start = NULL, *end = NULL, *p = NULL, *node = NULL;
	int ch, i, pos, k;
	printf("\nEnter element:");
	scanf("%d", &k);
	while (k != 0)
	{
		node = (struct list *)malloc(sizeof(struct list));

		node->data = k;
		node->next = NULL;
		node->prev = NULL;
		if (start == NULL)
		{
			start = node;
			p = node;
		}
		else
		{

			node->prev = p;
			p->next = node;
			p = node;
		}
		printf("\nEnter element:");
		scanf("%d", &k);
		end = node;
	}

	
	display(start);

	while (1)
	{
		printf("\ninsertion operations\n");
		printf("\n1.1st\n2.anywhere\n3.at end\n4.display\n5.exit\nEnter your choice:");
		scanf("%d", &ch);
		switch (ch)
		{
		case 1:
			
			printf("\nEnter value:");
			node = (struct list *)malloc(sizeof(struct list));
			scanf("%d", &node->data);
			node->next = start;
			
			start->prev = node;
			start = node;
			display(start);
		
			break;
		case 2:
			printf("\nEnter position:");
			scanf("%d", &pos);
			printf("Enter element:");
			node = (struct list *)malloc(sizeof(struct list));
			scanf("%d", &node->data);

			i = 1;
			p = start;
			while (i < pos - 1 && p != NULL)

			{
				i++;
				p = p->next;
			}
			node->prev = p;
			node->next = p->next;
			p->next->prev = node;
			p->next = node;
			display(start);

			break;
		case 3:
			printf("\nEnter element:");
			node = (struct list *)malloc(sizeof(struct list));
			scanf("%d", &node->data);
            node->next = NULL;
			node->prev = NULL;
			p= start;
			while (p->next != NULL)
			{
				p = p->next;
			}
			p->next = node;
			node->prev = p;
			display(start);

			break;
		case 4:

			display(start);
			break;

		case 5:
			printf("\nExiting........");
			exit(0);
		}
	}
}
void display(struct list *p)
{
	while (p != NULL)
	{
		printf("%d ", p->data);
		p = p->next;
	}
}