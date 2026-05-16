#include <stdio.h> 
#include <stdlib.h>
struct queue{
    int data;
    struct queue *next;
};
struct queue  *node=NUll, *front =NULL ,*rear = NULL, *temp= NULL;
void enqueue(int v){
    node->data = v;
    node->next= NULL;
    if(front==NULL){
        front= node;
        rear= node;
    }
    else{
        rear->next = node;
        rear = node;
    }
}

int dequeue(){
    int k ;
    if(front==NULL){
            printf("\nQueue is empty");
      return -1;
    }
    else{
        temp = front;
        k = temp->data;
        front= front->next;
            if(front==NULL)
             rear = NULL;
    free(temp);
    return k;
}
}
void display()
{
    temp = front;
    if (temp == NULL)
    {
        printf("\nQueue is empty");
    }
    else
    {
        printf("\nQueue is: ");
        while (temp != NULL)
        {
            printf("%d ", temp->data);
            temp = temp->next;
        }
    }
}

int main()
{
    
    printf("\nProgram executed succesffuly");
    return 0;
}