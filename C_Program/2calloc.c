#include<stdio.h>
int main(){
    int *p;
    int n,i;
    printf("enter size of array");
    scanf("%d",&n);
    p = (int*) calloc(n,sizeof(int));
    printf("\nEnter element in array");
    for(i=0;i<n;i++){
        scanf("%d",&p[i]);
    }
    printf("Display values:");
    for ( i = 0; i < n; i++)
    {
        printf("%d ",p[i]);

    }
    return 0;

}