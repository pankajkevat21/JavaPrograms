#include <stdio.h>
#include <conio.h>
#include<ctype.h>
#define size 15
    
    float st[size];
    int top = -1;
    void push(float v){
       top++;
       st[top]=v;
    }
    float pop(){
        return (st[top--]);
    }
int main()
{
    char post[size];
    char ch;
    float a,b;
    int i=0;
    while ((ch=getchar())!='\n')
    {
        if(ch!=','){
         post[i++]=ch;}
         post[i]='\0';
         i=0;
         while ((ch=post[i++])!='\0')
         {
            if(isdigit(ch))
             push((float)(ch-48));
             else{
                a=pop();
                b=pop();
                switch(ch){
                    case '+': push(b+a); 
                               break;
                    case '-': push(b-a); 
                               break;
                    case '*': push(b*a); 
                               break;
                    case '/': push(b/a); 
                               break;
                }
             }
         }
         
    }
    printf("\noutput=%s",st[top]);
    getch();
    return 0;
}