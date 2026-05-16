#define size 5
#include <stdio.h>
#include <stdlib.h>
int dq[size];
int rear = -1, front = -1;

void enq(int v)
{
    if (rear == size - 1)
    {
        printf("\nQueue is full ");
    }
    else
    {
        if (front == -1)
        {
            front = 0;
            rear = 0;
            dq[rear] = v;
        }
        else
        {
            rear++;
            dq[rear] = v;
        }
    }
}
int deletion()
{
    int ch, k;
    if (front == -1)
    {
        printf("\nQueue is empty");
        return -1;
    }
    else
    {
        printf("\nDeletion\n1.front end deletion\n2.Rear end deletion\nEnter your choice");
        scanf("%d", &ch);
        switch (ch)
        {
        case 1:
            k = dq[front];
            if (front == rear)
            {
                front = -1;
                rear = -1;
            }
            else
            {
                front++;
            }
            break;

        case 2:
            k = dq[rear];
            if (front == rear)
            {
                front = -1;
                rear = -1;
            }
            else
            {
                rear--;
            }
            break;
        default:
            printf("\nInvalid choice");
            return -1;
        }
    }
    return k;
}

void show()
{
    int i;
    if (front == -1)
    {
        printf("\nQueue is empty");
    }

    else
    { printf("\nYour Queue is:[");
        for (i = front; i <= rear; i++)
        {
            printf("%d ", dq[i]);
        }
        printf("]");
    }
}
int main()
{
    int ch, k;
    while (1)
    {
        printf("\nInput restricted Queue operation");
        printf("\n1.Insetion \n2.deletion\n3.Display Queue\n4.Exit queue");
        printf("\nEnter your choice:");
        scanf("%d", &ch);

        switch (ch)
        {
        case 1:
            printf("Enter element:");
            scanf("%d", &k);
            enq(k);
            break;
        case 2:
            k = deletion();
            if (k != -1)
            {
                printf("\nDeleted element is %d", k);
            }
            break;

        case 3:
            show();
            break;

        case 4:
            printf("\nExiting....");
            exit(0);
            break;
        default:
            printf("\nWrong choice please select valid operations");
            break;
        }
    }

    return 0;
}