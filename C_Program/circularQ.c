#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#define size 5
int cq[size];
int front = -1, rear = -1;

void enq(int v)
{
    if ((front == 0 && rear == size - 1) || (front == rear + 1))
        printf("\nqueue is full");
    else
    {
        if (front == -1)
        {
            front = 0;
            rear = 0;
            cq[rear] = v;
        }
        else
        {
            if (rear == size - 1)
            {
                rear = 0;
                cq[rear] = v;
            }
            else
            {
                rear++;
                cq[rear] = v;
            }
        }
    }
}
int deq()
{
    int k;
    if (front == -1)
    {
        printf("\nqueue is empty");
        return -1;
    }
    else
    {
        k = cq[front];
        if (front == rear)
        {
            front = -1;
            rear = -1;
        }
        else
        {
            if (front == size - 1)
            {
                front = 0;
            }
            else
            {
                front++;
            }
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
    {
        printf("\nQueue element is :[");
        if (front <= rear)
        {
            for (i = front; i <= rear; i++)
            {
                printf("%d ", cq[i]);
            }
        }

        else
        {
            for (i = front; i <= size - 1; i++)
            {
                printf("%d ", cq[i]);
            }
            for (i = 0; i <= rear; i++)
            {
                printf("%d ", cq[i]);
            }
        }
        printf("]");
    }
}
int main()
{
    int k, ch;
    while (1)
    {
        printf("\nCircular queue operation");
        printf("\n1.Insertion\n2.Deletion\n3.Display Queue\n4.exit");
        printf("\nEnter your choice:");
        scanf("%d", &ch);
        switch (ch)
        {
        case 1:
            printf("\nEnter element:");
            scanf("%d", &k);
            enq(k);
            break;
        case 2:
            k = deq();
            if (k != -1)
                printf("\nDeleted element is %d", k);
            break;

        case 3:
            show();

            break;
        case 4:
            printf("\nExiting.........");
            exit(0);
            break;
        default:
            printf("\nWrong Choice");
            break;
        }
    }

    getch();
    return 0;
}