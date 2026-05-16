#include <stdio.h>
#include <ctype.h>
#include <math.h>

float stack[50];
int top = -1;

void push(float x)
{
    stack[++top] = x;
}

float pop()
{
    return stack[top--];
}

int main()
{
    char postfix[100];
    int i = 0;
    float num, a, b;

    printf("Enter postfix expression:\n");
    scanf(" %[^\n]", postfix);

    while (postfix[i] != '\0')
    {
        /* ignore space or comma */
        if (postfix[i] == ' ' || postfix[i] == ',')
        {
            i++;
            continue;
        }

        /* read number (multi-digit allowed) */
        if (isdigit(postfix[i]))
        {
            num = 0;
            while (isdigit(postfix[i]))
            {
                num = num * 10 + (postfix[i] - '0');
                i++;
            }
            push(num);
        }
        else   /* operator */
        {
            b = pop();   // exponent or second operand
            a = pop();   // base or first operand

            switch (postfix[i])
            {
                case '+': push(a + b); break;
                case '-': push(a - b); break;
                case '*': push(a * b); break;
                case '/': push(a / b); break;
                case '^':
                case '$': push(pow(a, b)); break;
            }
            i++;
        }
    }

    printf("Result = %.2f", pop());
    return 0;
}
