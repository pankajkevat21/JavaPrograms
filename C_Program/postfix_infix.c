#include <stdio.h>
#include <string.h>
#include <ctype.h>

char stack[20][20];
int top = -1;

int main()
{
    char postfix[20], a[20], b[20], exp[20];
    int i;

    printf("Enter postfix expression: ");
    scanf("%s", postfix);

    for (i = 0; postfix[i]; i++)
    {
        if (isalnum(postfix[i]))
        {
            exp[0] = postfix[i];
            exp[1] = '\0';
            strcpy(stack[++top], exp);
        }
        else
        {
            strcpy(b, stack[top--]);   // second operand
            strcpy(a, stack[top--]);   // first operand
            sprintf(exp, "(%s%c%s)", a, postfix[i], b);
            strcpy(stack[++top], exp);
        }
    }

    printf("Infix expression = %s", stack[top]);
    return 0;
}
