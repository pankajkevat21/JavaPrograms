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
    struct list *t = NULL, *start = NULL, *end = NULL, *p = NULL, *node = NULL;
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
        printf("\nDeletion  operations\n");
        printf("\n1.1st\n2.anywhere\n3.at end\n4.display\n5.exit\nEnter your choice:");
        scanf("%d", &ch);
        switch (ch)
        {
        case 1:
            if (start == NULL)
            {
                printf("List is empty\n");
            }
            else
            {
                p = start;
                start = start->next;
                if (start != NULL)
                    start->prev = NULL;
                free(p);
            }
            break;
        case 2:
            if (start == NULL)
            {
                printf("List empty\n");
                break;
            }

            printf("Enter position: ");
            scanf("%d", &pos);

            p = start;
            i = 1;

            while (i < pos && p != NULL)
            {
                p = p->next;
                i++;
            }

            if (p == NULL)
            {
                printf("Invalid position\n");
            }
            else if (p == start)
            {
                start = start->next;
                if (start != NULL)
                    start->prev = NULL;
                free(p);
            }
            else if (p->next == NULL)
            {
                p->prev->next = NULL;
                free(p);
            }
            else
            {
                p->prev->next = p->next;
                p->next->prev = p->prev;
                free(p);
            }

            break;
        case 3:
            if (start == NULL)
            {
                printf("List empty\n");
            }
            else if (start->next == NULL)
            {
                free(start);
                start = NULL;
            }
            else
            {
                p = start;
                while (p->next != NULL)
                    p = p->next;

                p->prev->next = NULL;
                free(p);
            }

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