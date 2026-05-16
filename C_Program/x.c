#include <stdio.h> 
#include <stdlib.h>

int main()
{
    int x = 10;
    int p = &x;
    p=20;
    printf("\n%d",x);
    printf("\nProgram executed succesffuly");
    return 0;
}