#include <stdio.h>
#include <stdlib.h>

struct list
{
    int data;
    struct list *next;
};

void display(struct list *start); // function prototype

int main()
{
    int pos, i, ch;
    struct list *node = NULL, *start = NULL, *p = NULL, *temp = NULL;
    int k = 1;

    printf("\nIf you want to stop creating list, enter 0");
    while (k != 0)
    {
        node = (struct list *)malloc(sizeof(struct list));
        printf("\nEnter value: ");
        scanf("%d", &k);

        if (k == 0)
            break;

        node->data = k;
        node->next = NULL;

        if (start == NULL)
        {
            start = node;
            p = node;
        }
        else
        {
            p->next = node;
            p = node;
        }
    }
    display(start);
    /* Insertion Menu */
    printf("\n\nInsertion Menu");
    printf("\n1. Insertion at First");
    printf("\n2. Insertion at Any Position");
    printf("\n3. Insertion at Last");
    printf("\nEnter your choice: ");
    scanf("%d", &ch);

    switch (ch)
    {
    /* Insertion at First */
    case 1:
        node = (struct list *)malloc(sizeof(struct list));
        printf("\nEnter element: ");
        scanf("%d", &node->data);

        node->next = start;
        start = node;
        break;

    /* Insertion at Any Position */
    case 2:
        printf("\nEnter position: ");
        scanf("%d", &pos);

        node = (struct list *)malloc(sizeof(struct list));
        printf("\nEnter element: ");
        scanf("%d", &node->data);

        if (pos == 1)
        {
            node->next = start;
            start = node;
        }
        else
        {
            p = start;
            i = 1;

            while (i < pos - 1 && p != NULL)
            {
                p = p->next;
                i++;
            }

            if (p == NULL)
            {
                printf("\nPosition not found");
            }
            else
            {
                node->next = p->next;
                p->next = node;
            }
        }
        break;

    /* Insertion at Last */
    case 3:
        node = (struct list *)malloc(sizeof(struct list));
        printf("\nEnter element: ");
        scanf("%d", &node->data);
        node->next = NULL;

        if (start == NULL)
        {
            start = node;
        }
        else
        {
            temp = start;
            while (temp->next != NULL)
            {
                temp = temp->next;
            }
            temp->next = node;
        }
        break;

    default:
        printf("\nInvalid choice");
    }

    /* Display List */
    display(start);

    printf("\nProgram executed successfully");
    return 0;
}

/* Display Function */
void display(struct list *start)
{
    struct list *p;
    if (start == NULL)
    {
        printf("\nList is empty");
        return;
    }

    printf("\nDisplay list: ");
    p = start;
    while (p != NULL)
    {
        printf("%d ", p->data);
        p = p->next;
    }
}
