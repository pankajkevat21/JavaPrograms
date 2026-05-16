#include<stdio.h>
int main(){
    int n,i;
    float sum = 0, avg;
    printf("Enter the number of elements:");
    scanf("%d",&n);
    float arr[n];
    printf("Enter %d numbers:",n);
    for(i=0;i<n;i++){
        scanf("%f",&arr[i]);
        sum+=arr[i];
    }
    avg = sum/n;
    printf("average of the entered numbers:%2f",avg);
    return 0;
}