#include<stdio.h>
#include<ctype.h>
char st[20];
int top = -1,k;
void push(char v){
    top++;
    st[top]=v;
}

 char pop(){
    if(top==-1)
     printf("\nstack is empty");
    else{
        k=st[top];
        top--;
        return k;

    }
 }
  int pre(char c){
    switch(c){
        case '#':return 0;
        case '(':return 1;
        case '+':return 2;
        case '-':return 2;
        case '*':return 3;
        case '/':return 3;
        case '$':return 4;
    }
  }
  int main(){
    char ch;
    char infix[15],post[15];
    int i=0;
    int k=0;
    printf("\nenter infix expression:");
    scanf("%s",infix);
    push('#');
    while((ch=infix[i++])!='\0'){
        if(ch=='(')
         push(ch);
        else{
            if(isalnum(ch))
             post[k++]=ch;
            else{
                if(ch==')'){
                    while(st[top]!='(')
                     post[k++]=pop();
                    pop();
                }
                else{
                    while(pre(st[top])>=pre(ch))
                     post[k++]=pop();
                     push(ch);
                }
            }
        }
    }
    while(st[top]!='#')
     post[k++]=pop();
    post[k]='\0';
    printf("\npostfix expression is:%s",post);
    return 0;
  }