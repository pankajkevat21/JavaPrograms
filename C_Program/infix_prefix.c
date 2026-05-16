#include<stdio.h>
#include <string.h>
#include<ctype.h>
#define size 100
char st[size];
int top =-1;

void push(char v)
{
    st[++top]=v;
}
char pop(){
    return st[top--];
}
int pre(char c)
{
    switch (c)
    {
    case '#':
        return 0;
    case '(':
        return 1;
    case '+':
    case '-':
        return 2;
    case '*':
    case '/':
        return 3;
    case '^':
        return 4;
    default:
        return -1;
    }
}
void strrv(char infix[])
{
    char temp;
    int i=0;
    int j=0;
    for (i=0,j= strlen(infix)-1;i<j; i++,j-- )
    {
           temp = infix[i];
           infix[i]= infix[j];
           infix[j]= temp;
    }
}
int main(){
    char infix[size], prefix[size];
    char ch;
    int i=0, k=0;
    printf("\nEnter infix expression:");
    scanf("%s", infix);
    strrv(infix);
    
    for(i=0; infix[i];i++)
    {
        if(infix[i]=='(')
        infix[i]=')';
        
        else {
            if(infix[i]==')')
             infix[i]='(';

        }
        
    }
    top=-1;
    push('#');
    i=0;
    while((ch=infix[i++])!='\0')
    {
         if (isalnum(ch))
        {
            prefix[k++] = ch;
        }
       else  if(ch=='(')
         {
            push(ch);
         }
         else if(ch==')')
         {
            while(st[top]!='(')
             prefix[k++]=pop();
            pop();
         }
         else{
          while(pre(st[top]) > pre(ch))

            {
                prefix[k++]=pop();
            }
            push(ch);
         }
    }
   while (st[top] != '#')
        prefix[k++] = pop();

    prefix[k] = '\0';

    /* STEP 4: reverse postfix → prefix */
    strrv(prefix);

    printf("Prefix expression = %s", prefix);
    return 0;
}