#include<stdio.h>
int main(){
    char a[150];
    int count =0;
   printf("enter a sentence:");
   gets(a);

    for(int i =0; a[i]!='\0';i++){
            if(a[i] == ' '){
                count++;
            }

    }
    printf("number of spaces:%d",count);
    printf("\nNumber of words:%d",count+1);
}