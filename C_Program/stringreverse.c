#include <stdio.h>
#include <conio.h>

int main()
{
    char s[]= "1234567890";
    int i, len =0;
    while (s[len]!='\0')
    {
        len++;
    }
    for(i=len-1;i>=0;i--){
        printf("%c",s[i]);
    }
    

    getch();
    return 0;
}