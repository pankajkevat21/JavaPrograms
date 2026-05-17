#include <stdio.h>
#include <string.h>
#include <ctype.h>

char stack[20][20];
int top = -1;

int main()
{
    char prefix[20], a[20], b[20], exp[20];
    int i;

    printf("Enter prefix expression: ");
    scanf("%s", prefix);

    for (i = strlen(prefix) - 1; i >= 0; i--)
    {
        if (isalnum(prefix[i]))
        {
            exp[0] = prefix[i];
            exp[1] = '\0';
            strcpy(stack[++top], exp);
        }
        else
        {
            strcpy(a, stack[top--]);   // first operand
            strcpy(b, stack[top--]);   // second operand
            sprintf(exp, "%s%s%c", a, b, prefix[i]);
            strcpy(stack[++top], exp);
        }
    }

    printf("Postfix expression = %s", stack[top]);
    return 0;
}
