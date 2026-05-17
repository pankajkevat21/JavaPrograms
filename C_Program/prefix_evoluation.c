#include <stdio.h>
#include <ctype.h>
#include <string.h>
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
    char prefix[100];
    int i;
    float num, a, b, place;

    printf("Enter prefix expression:\n");
    scanf(" %[^\n]", prefix);   // read full line

    /* scan RIGHT to LEFT */
    for (i = strlen(prefix) - 1; i >= 0; i--)
    {
        /* ignore space or comma */
        if (prefix[i] == ' ' || prefix[i] == ',')
            continue;

        /* read number (multi-digit) */
        if (isdigit(prefix[i]))
        {
            num = 0;
            place = 1;

            while (i >= 0 && isdigit(prefix[i]))
            {
                num += (prefix[i] - '0') * place;
                place *= 10;
                i--;
            }
            i++;   // index adjust
            push(num);
        }
        else   /* operator */
        {
            a = pop();   // first operand
            b = pop();   // second operand

            switch (prefix[i])
            {
                case '+': push(a + b); break;
                case '-': push(a - b); break;
                case '*': push(a * b); break;
                case '/': push(a / b); break;
                case '^':
                case '$': push(pow(a, b)); break;
            }
        }
    }

    printf("Result = %.2f", pop());
    return 0;
}
