#include <stdio.h> 
#include <stdlib.h>

int main()
{
    int n,rem,rev=0,temp;
    printf("\nEnter a number:");
        scanf("%d", &n);
        temp = n;
        while(n!=0)
        {
             rem = n%10;
             rev = rev*10+rem;
             n= n/10;

        }
        if(temp==rev)
        {
            printf("the number is palindrome");

        }
        else
         printf("\nthe no. is not palindreome");
    printf("\nProgram executed succesffuly");
    return 0;
}