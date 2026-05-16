#include <stdio.h>
#include <stdlib.h>
struct list
{
	int data;
	struct list *next;
};
void display(struct list *dis);
int main()
{
	struct list *start = NULL, *node = NULL, *p = NULL;
	int k, ch, pos, i = 1;
	printf("\nEnter element:");
	scanf("%d", &k);
	while (k != 0)
	{
		node = malloc(sizeof(struct list));
		node->data = k;
		node->next = NULL;
		if (start == NULL)
		{
			start = node;
			p = node;

			p->next = start;
		}
		else
		{
			p->next = node;
			p = node;
			p->next = start;
		}
		printf("\nEnter element:");
		scanf("%d", &k);
	}
	printf("\ndisplay list :");
	p = start;
	display(p);
	printf("\nInsertion menu\n");
	printf("\n1.at first\n2.anywhere\n3.at end\n4.display\n5.Exit.");
	while (1)
	{
		printf("\nEnter your choice:");
		scanf("%d", &ch);
		switch (ch)
		{
		case 1:
			node = malloc(sizeof(struct list));
			printf("\nEnter element:");
			scanf("%d", &node->data);
			node->next = NULL;
			p = start;
			while (p->next != start)
			{
				p = p->next;
			}
			node->next = start;
			start = node;
			p->next = start;
			display(start);
			break;

		case 2:
			printf("\nEnter position:");
			scanf("%d", &pos);
			node = malloc(sizeof(struct list));
			printf("\nEnter element:");
			scanf("%d", &node->data);
			node->next = NULL;
			p = start;
			i=1;

			while (i < pos - 1 && p->next != start)
			{
				i++;
				p = p->next;
			}
			node->next = p->next;
			p->next = node;
			display(start);
			break;
		case 3:
			printf("\nEnter element:");
			node = malloc(sizeof(struct list));
			scanf("%d", &node->data);
			node->next = NULL;
			p = start;
			while (p->next != start)
			{
				p = p->next;

			}
				node->next = p->next;
				p->next = node;
				display(start);
				break;

			case 4:
				exit(0);
			}
		}

		return 0;
	}
	void display(struct list * start)
	{
		struct list *p = start;
		do
		{
			printf("%d ", p->data);
			p = p->next;
		} 
		while (p != start);
	}
