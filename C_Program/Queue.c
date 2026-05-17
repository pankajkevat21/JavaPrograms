#include <stdio.h>
#include <conio.h>
#include<stdlib.h>
#define size 5
int q[size];
int front=-1;
int rear =-1;

void enqueue(int v){
  if(rear==size-1){
    printf("\nQueue is full");
  }else{
    if(front==-1){
        front =0;
        rear=0;
    }else{
        rear++;
    }
    q[rear]=v;
  }
}

int dequeue(){
    int k;
    if(front==-1){
     printf("\nQueue is empty");
     return -1;
    }

    else
    {
        k=q[front];
        if(front==rear){
            front=-1;
            rear =-1;
        }else{
            front++;
        }
    }
    return k;
}

void display(){
    int i;
    if(front==-1)
    {
        printf("\nQueue is empty ");
    }else{
        for(i=front;i<=rear;i++)
        {
            printf("%d ",q[i]);
        }
    }
}
int main()
{
    int k,ch;
    while(1){
        printf("\nQueue operations");
        printf("\n1.Insertion \n2.Deletion\n3.Traversing\n4.Exit");
        printf("\nEnter Your choice:");
        scanf("%d", &ch);
        switch (ch)
        {
        case 1: printf("Enter element:");
                scanf("%d", &k);
                enqueue(k);
            break;
        case 2: k=dequeue();
              if(k!=-1)
                printf("\nDeleted element is %d",k);
            break;
        case 3: display();
                 break;
                 case 4: printf("\nProgram terminated successfully.");
                 exit(0);
                  break;
        default:printf("\nPlease enter correct operations");
            break;
        }
    }

    getch();
    return 0;
}