#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>

#define size 20

int top = -1;
char st[size];

void push(char v)
{
    st[++top] = v;
}

char pop()
{
    if (top == -1)
        return -1;
    return st[top--];
}

int pre(char c)
{
    switch (c)
    {
        case '#': return 0;
        case '(': return 1;
        case '+':
        case '-': return 2;
        case '*':
        case '/': return 3;
        case '^':
        case '$': return 4;
        default: return -1;
    }
}

int main()
{
    char ch, infix[20], post[20];
    int i = 0, k = 0;

    printf("Enter infix expression: ");
    scanf("%s", infix);

    push('#');

    while ((ch = infix[i++]) != '\0')
    {
        if (ch == '(')
        {
            push(ch);
        }
        else if (isalnum(ch))
        {
            post[k++] = ch;
        }
        else if (ch == ')')
        {
            while (st[top] != '(')
            {
                post[k++] = pop();
             }
            pop(); // remove '('
        }
        else
        {
            while (pre(st[top]) >= pre(ch))
            {
                post[k++] = pop();
            }
            push(ch);
        }
    }

    while (st[top] != '#')
        post[k++] = pop();

    post[k] = '\0';

    printf("Postfix expression = %s", post);
    return 0;
}
