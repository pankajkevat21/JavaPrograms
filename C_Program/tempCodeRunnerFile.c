#include <stdio.h>
#include <string.h>
#include <ctype.h>
#include <conio.h>
int top = -1;
char st[20];
void push(char v)
{
    top++;
    st[top] = v;
}
char pop()
{
    if (top == -1)
        printf("\nstack is empty");
    else
        return st[top--];
}
int pre(char c)
{
    switch (c)
    {
    case '+':
    case '-':
        return 1;

    case '*':
    case '/':
        return 2;

    case '^':
    case '$':
        return 3;

    case '(':
    case ')':
    case '#':
        return 0;
    }
}
int main()
{
    char infix[15];
    char postix[15];
    char ch;
    int i = 0, k = 0;
    printf("\nenter prefix expression:");
    scanf("%s", &infix);
    push('#');

    while (ch = infix[i++] != '\0')
    {
        if (ch == ')')
        {
            push(ch);
        }
        else
        {
            if (isalnum(ch))
            {
                postix[k++] = ch;
            }
            else
            {
                if (ch == '(')
                {
                    while (st[top] != ')')
                    {
                        postix[k++] = pop();
                    }
                    pop();
                }
                else
                {
                    while (pre(st[top] > pre(ch)))
                    {
                        postix[k++] = pop();
                    }
                    push(ch);
                }
            }
        }
    }
    while(st[top]!='#'){
        postix[k++]=pop();
        postix[k]='\0';
        printf("prefix expression is:%s",postix);
        return 0;
    }

    getch();
    return 0;
}