#include <stdlib.h>
#include <stdio.h>
struct stack
{
    int data;
    struct stack *next;
};
struct stack *top = NULL, *p = NULL, *temp = NULL, *node = NULL;
void push(int v)
{
    node = (struct stack *)malloc(sizeof(struct stack));
    node->data = v;
    node->next = NULL;
    if (top == NULL)
    {
        top = node;
    }

    else
    {
        node->next = top;
        top = node;
    }
}

int pop()
{
    int k;
    if (top == NULL)
    {
        printf("Stack is empty ");
        return -1;
    }
    else
    {
        p = top;
        top = top->next;
        k = p->data;
        free(p);
        return k;
    }
}
void display()
{
    temp = top;
    if (temp == NULL)
    {
        printf("stack is empty");
    }
    else
    {
        printf("stack is :");
        while (temp != NULL)
        {
            printf("%d ", temp->data);
            temp = temp->next;
        }
    }
}
int main()
{
    int ch, v, k;
    while (1)
    {
        printf("\n Stack operations\n1.push\n2.pop\n3.display stack elements\n4.Exit stack");
        printf("\nEnter your choice:");
        scanf("%d", &ch);

        switch (ch)
        {
        case 1:
            printf("\nEnter element:");
            scanf("%d", &v);
            push(v);
            break;

        case 2:
            k = pop();
            if (k != -1)
                printf("\nPopped element is %d", k);
            break;

        case 3:
            display();
            break;
        case 4:
            printf("\nExiting......");
            exit(0);
            break;
        default:
            printf("INvalid choice");
        }
    }
    return 0;
}
