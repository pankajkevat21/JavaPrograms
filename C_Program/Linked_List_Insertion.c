#include <stdio.h>
#include <stdlib.h>

struct list
{
    int data;
    struct list *next;
};

int main()
{
    struct list *node = NULL, *head = NULL, *temp = NULL;
    int k = 1, ch, i, pos;

    /* Creating initial list */
    while (1)
    {
        printf("\nEnter value (0 to stop): ");
        scanf("%d", &k);

        if (k == 0)
            break;

        node = (struct list *)malloc(sizeof(struct list));
        node->data = k;
        node->next = NULL;

        if (head == NULL)
        {
            head = node;
            temp = node;
        }
        else
        {
            temp->next = node;
            temp = node;
        }
    }

    /* Initial Display */
    printf("\nInitial list: ");
    temp = head;
    while (temp != NULL)
    {
        printf("%d ", temp->data);
        temp = temp->next;
    }

    /* Insertion menu */
    while (1)
    {
        printf("\n\nInsertion operations");
        printf("\n1. Insert at first");
        printf("\n2. Insert at any position");
        printf("\n3. Insert at last");
        printf("\n4. Exit");
        printf("\nEnter your choice: ");
        scanf("%d", &ch);

        switch (ch)
        {
        case 1: /* Insert at first */
            node = (struct list *)malloc(sizeof(struct list));
            printf("\nEnter value: ");
            scanf("%d", &node->data);

            node->next = head;
            head = node;
            break;

        case 2: /* Insert at any position */
            node = (struct list *)malloc(sizeof(struct list));

            printf("\nEnter position: ");
            scanf("%d", &pos);

            printf("Enter value: ");
            scanf("%d", &node->data);

            /* Insert at first position */
            if (pos == 1)
            {
                node->next = head;
                head = node;
                break;
            }

            temp = head;
            i = 1;

            while (i < pos - 1 && temp != NULL)
            {
                temp = temp->next;
                i++;
            }

            if (temp == NULL)
            {
                printf("\nInvalid position");
                free(node);
            }
            else
            {
                node->next = temp->next;
                temp->next = node;
            }
            break;

        case 3: /* Insert at last */
            node = (struct list *)malloc(sizeof(struct list));
            printf("\nEnter value: ");
            scanf("%d", &node->data);

            node->next = NULL;

            if (head == NULL)
            {
                head = node;
            }
            else
            {
                temp = head;
                while (temp->next != NULL)
                {
                    temp = temp->next;
                }
                temp->next = node;
            }
            break;

        case 4:
            printf("\nExiting insertion menu...");
            goto display;

        default:
            printf("\nInvalid choice! Try again.");
        }
    }

display:
    /* Final Display */
    printf("\n\nFinal list: ");
    temp = head;
    while (temp != NULL)
    {
        printf("%d ", temp->data);
        temp = temp->next;
    }

    return 0;
}
  

