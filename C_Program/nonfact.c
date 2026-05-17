#include <stdio.h> 
#include <stdlib.h>

int main()
{
    int n, fact =1;
    printf("\nEnter a no.:");
    scanf("%d", &n);
    if(n!=0)
    {
        for(int i=1;i<=n;i++)
        {
            fact *= i;

        }
    }
    printf("\n %d is a factorial", fact);
    printf("\nProgram executed succesfully");
    return 0;
}