#include<stdio.h>
int main(){
    int a[15],n,e,i,flag = 0,p;
    printf("how many elements in array:");
    scanf("%d",&n);
    printf("enter elements in array:");
    for ( i = 0; i < n; i++)
    {
        scanf("%d",&a[i]);
    }
    printf("Enter element you want to search:");
    scanf("%d",&e);
    for ( i = 0; i < n; i++)
    {
        if (e==a[i])
        {
            flag = 1;
            p=i+1;
            break;
        }
        
    }
    if (flag==1)
    {
        printf("Element found at position %d or array index %d",p,i);

    }
    else{
        printf("element not found in the array");

    }
    return 0;

    
    
    
}