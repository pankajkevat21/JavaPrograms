#include<stdio.h>
int main(){
    char a = 'A';
    int n;
    printf("Enter a number:");
    scanf("%d",&n);
    for(int i=0;i<=n;i++){
        a = 'A';
        for(int j=1;j<=i;j++){
            printf("%c",a++);
        }
        printf("\n");
    }
     n--;    
    for(int i=n;i>=1;i--){
        a = 'A';
        for(int j=1;j<=i;j++){
            printf("%c",a++);
        }
        printf("\n");
    }
    return 0;
}