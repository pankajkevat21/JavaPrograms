#include <stdio.h>
#include <stdlib.h>
struct list
{
    int data;
    struct list *next;
    struct list *prev;
};
void show(struct list *p);
int main()
{

    struct list *t = NULL, *node = NULL, *start = NULL, *p = NULL;
    int k, ch, pos, i;
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
            node->next = start;
            node->prev = start;
            p = node;
        }
        else
        {
            p->next = node;
            node->next = start;
            node->prev = p;
            p = node;
            start->prev = p;
        }
        printf("\nEnter element:");
        scanf("%d", &k);
    }
    p = start;
    show(p);
    while (1)
    {
        printf("\ndeletion operations\n");
        printf("\n1.1st\n2.anywhere\n3.at end\n4.display\n5.exit\nEnter your choice:");
        scanf("%d", &ch);
        switch (ch)
        {
        case 1:
            p = start;
            t = start->prev;
            start = start->next;
            start->prev = t;
            t->next = start;
            free(p);
            break;

        case 2:

            printf("\nEnter position:");
            scanf("%d", &pos);

            i = 1;
            p = start;
            while (i < pos && p->next != start)
            {
                p = p->next;
                i++;
            }

            p->prev->next = p->next;
            p->next->prev = p->prev;
            free(p);
            break;

        case 3:
            p = start->prev;
            p->prev->next = start;
            start->prev = p->prev;
            free(p);

            break;

        case 4:
            show(start);
            break;

        case 5:
            printf("\nExiting........");
            exit(0);

        default:
            printf("Invalid choice\n");
        }
    }
    printf("\nProgram executed succesffuly");
    return 0;
}

void show(struct list *start)
{
    if (start == NULL)
    {
        printf("\nList is empty");
        return;
    }

    struct list *p = start;
    printf("\nDisplay list: ");
    do
    {
        printf("%d ", p->data);
        p = p->next;
    } while (p != start);
}
