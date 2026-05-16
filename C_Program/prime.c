#include <stdio.h> 
#include <stdlib.h>

int main()
{
    int n,i,j;
    printf("\nEnter n element:");
    scanf("%d", &n);
    for(i=2;i<=n;i++)
    {
        for(j=2;j<i;j++)
        {
            if(i%j==0)
             break;
        }
        if(j==i)
         printf("%d ",i);
    }
    printf("\nProgram executed succesffuly");
    return 0;
}