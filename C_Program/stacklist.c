#include <stdio.h>
#include <stdlib.h>

struct stack
{
    int data;
    struct stack *next;
};
struct stack *node = NULL, *p = NULL, *top = NULL;
void push(int value)
{
    node = (struct stack *)malloc(sizeof(struct stack));
    node->data = value;
    node->next = NULL;
    if (top == NULL)
    {
        top = node;
    }else{
        node->next= top;
        top= node;
    }

}
int pop()
{
    int k;
    if (top == NULL)
    {
        printf("\nStack is empty");
        return -1;
    }
    else
    {
        p=top;
        top=top->next;
        k=p->data;
        free(p);
        return k;

    }
}
void display(){
    p= top;
    if(top==NULL)
    {
        printf("\nStack is empty");

    }else{
         while (p!=NULL)
         {
              printf("%d ",p->data);
              p = p->next;
         }
         
    }
}
int main()
{
    int i, ch,k;
    while (1)
    {
        printf("\nStack operations");
        printf("\n1.push\n2.pop\n3.display\n4.exit");
        printf("\nEnter your choice:");
        scanf("%d", &ch);
        switch(ch){
            case 1: printf("\nEnter element:");
                    scanf("%d", &k);
                    push(k);
                    break;
            case 2: k= pop();
                    if(k!=-1)
                     printf("\npoped element is %d",k);
                     break;
            case 3: printf("\nStack --->");
                     display();
                     break;
            case 4: printf("\nExiting....");
                    goto terminate;
            default: printf("\nInvalid choice");
        }
    }
    
        terminate:
    printf("\nProgram executed succesffuly");
    return 0;
}