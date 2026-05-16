
#include <stdio.h>
#include <conio.h>
#include <stdlib.h>
int st[5];
int top = -1;
int isfull()
{
    if (top == 4)
        return 1;
    else
        return 0;
}
int isempty()
{
    if (top == -1)
        return 1;
    else
        return 0;
}
void push(int v)
{
    if (isfull())
    {
        printf("\nstack is full");
    }
    else
    {
        top++;
        st[top] = v;
    }
}
int pop()
{

    if (isempty())
    {
        printf("\nstack is empty");
        return -1;
    }
    else
    {
        return (st[top--]);
    }
}
void show()
{
    if (isempty())
    {
        printf("stack is empty");
    }
    else
    {
        for (int i = 0; i <= top; i++)
        {
            printf("\n%d", st[i]);
        }
    }
}

int main()
{
    int c, v;
    while (1)
    {
        printf("\nstack operation");
        printf("\n1.push \n2.pop\n3.display\n4.exit\nEnter your choice:");
        scanf("%d", &c);
        switch (c)
        {
        case 1:
            printf("\nenter element you want push on stack:");
            scanf("%d", &v);
            push(v);
            break;
        case 2:
            v = pop();
            if (v != 1)
                printf("\npoped element :%d", v);
            break;
        case 3:
            printf("\nstack---->");
            show();
            break;
        case 4:
            exit(0);
        default:
            printf("\nwrong choice");
            break;
        }
    }

    getch();
    return 0;
}