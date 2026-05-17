#include <stdio.h>
#include <stdlib.h>

struct list{
    int data;
    struct list *next;
};

int main()
{
    struct list *node=NULL, *p=NULL, *start=NULL;
    int k, i=1, found=0;

    printf("\nEnter element: ");
    scanf("%d", &k);

    while(k != 0)
    {
        node = (struct list *)malloc(sizeof(struct list));
        node->data = k;
        node->next = NULL;

        if(start == NULL)
        {
            start = node;
            p = node;
        }
        else
        {
            p->next = node;
            p = node;
        }

        printf("\nEnter element: ");
        scanf("%d", &k);
    }

    // Display list
    p = start;
    printf("\nList: ");
    while(p != NULL)
    {
        printf("%d ", p->data);
        p = p->next;
    }

    // Search
    p = start;
    printf("\nEnter element what you find: ");
    scanf("%d", &k);

    while(p != NULL)
    {
        if(p->data == k)
        {
            printf("\nElement found at position %d", i);
            found = 1;
            break;
        }
        p = p->next;
        i++;
    }

    if(found == 0)
    {
        printf("\nElement not present in this list");
    }

    printf("\nProgram executed successfully");
    return 0;
}
