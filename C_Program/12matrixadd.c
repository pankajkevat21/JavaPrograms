#include<stdio.h>
int main(){
    int n;
   printf("please enter value of n*n matrices:");
    scanf("%d",&n);
    int first[n][n];
    int second[n][n];
    printf("Please enter 1st matrix:");
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            scanf("%d",&first[i][j]);
        }
    }
    printf("\n");
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            printf("%d ",first[i][j]);
            // printf("\narr[%d][%d]=%d ",i,j,arr[i][j]);
        }
        printf("\n");
    }
    printf("\nPlease enter second matrix:");
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            scanf("%d",&second[i][j]);
        }
    }
    printf("\n");
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            printf("%d ",second[i][j]);
            // printf("\narr[%d][%d]=%d ",i,j,arr[i][j]);
        }
        printf("\n");
    }
    printf("\nAddition:\n");
    for(int i=0;i<n;i++)
    {
    for(int j=0;j<n;j++){
        printf("%d ",first[i][j]+second[i][j]);
    }
        printf("\n");

    }


    }
