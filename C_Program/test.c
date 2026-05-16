
#include <stdio.h>
#include <stdlib.h>
#define size 6 
int dQ[size];
int front =-1, rear =-1;

void enq(int v){
    int k;
    if(front==0&&rear==size-1){
            printf("\nQueue is full");
            return;
             }
    
    else{
        printf("\n1.Front end Insertion\n2.Rear end nInsertion");
        printf("\nChoise your option:");
        scanf("%d",&k);
        switch(k){
            case 1:
            if(front==-1){
                 rear=0;
                 front=0;
                 dQ[front]=v;
                }
                
             else{
            if(front==0){
                printf("\nInsertion not allowed here");
            }
            else{
                front--;
                dQ[front]=v;
            }
        }
            break;
     case 2:if(front==-1){
                  front=0;
                  rear=0;
                  dQ[rear]=v;
                    } 
                    else{
                        rear++;
                        dQ[rear]=v;
                    }
                    break;
                    
                    default: printf("\nInvalid choice");
                    break;
      }
    }

}

int deq()
{
    int k;
    if (front == -1)
    {
        printf("\nQueue is empty");
        return -1;
    }

    k = dQ[front];

    if (front == rear)
        front = rear = -1;
    else
        front++;

    return k;
}
void show()
{
    if (front == -1)
    {
        printf("\nQueue is empty");
        return;
    }

    printf("\nDeque elements: ");
    for (int i = front; i <= rear; i++)
    {
        printf("%d ", dQ[i]);
    }
}


int main()
{
   int ch,i;
    while(1){
         printf("\n1.Enqueue\n2.Dequeue\n3.Display\n4.Exit");
         printf("\nEnter your choice:");
         scanf("%d",&ch);
         switch(ch){
              case 1: printf("\nEnter value to be inserted:");
                     scanf("%d",&i);
                     enq(i);
                     break;
              case 2: i=deq();
                     if(i!=-1)
                     printf("\nDeleted element is:%d",i);
                     break;
              case 3: show();
                     break;
              case 4: exit(0);
              default: printf("\nInvalid choice");
         }
    }
    return 0;
    
}