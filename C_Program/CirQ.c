#include <stdio.h>
#include <conio.h>
#include <stdlib.h>
#define size 6
int CQ[size];
int front = -1, rear = -1;

void enqueue(int v)
{
    if ((front == 0 && rear == size - 1) || (front == rear + 1))
    {
        printf("\nQueue is full");
    }
    else
    {
        if (front == -1)
        {
            front = 0;
            rear = 0;
            CQ[rear] = v;
        }
        else
        {
            if (rear == size - 1)
            {
                rear = 0;
                CQ[rear] = v;
            }
            else
            {
                rear++;
                CQ[rear] = v;
            }
        }
    }
}

int dequeue()
{
    int k;
    if (front == -1)
    {
        printf("\nQueue is empty");
        return -1;
    }
    else
    {
        k = CQ[front];
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
        if (front <= rear)
        {
            for (i = front; i <= rear; i++)
            {
                printf("%d ", CQ[i]);
            }
        }
        else
        {
            for (i = front; i <= size - 1; i++)
            {
                printf("%d ", CQ[i]);
            }
            for (i = 0; i <= rear; i++)
            {
                printf("%d ", CQ[i]);
            }
        }
    }
}
int main()
{

    getch();
    return 0;
}