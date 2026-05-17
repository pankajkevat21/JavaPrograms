#include <stdio.h>
#include <conio.h>

int main()
{   int a,isPrime=1;
    printf("\nEnter a number:");
    scanf("%d", &a);
   if(a<=1){
    printf("\n%d is not a prime number",a);
    return 0;
   }
    for (int i = 2; i < a; i++)
    {
        if (a%i==0)
        {
            isPrime =0;
            break;
        }
    }
    if(isPrime==1)
     printf("%d is  a prime number",a);
    else
     printf("\n%d is NOT a prime number",a);
    getch();
    return 0;
}