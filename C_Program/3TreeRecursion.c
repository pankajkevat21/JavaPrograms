#include<stdio.h>
int fib(int n){
    //tree/non linear recursion
    if(n==0)
     return 0;
    if(n==1)
     return 1;
    else
     return ( fib(n-1)+fib(n-2));
}
int main(){
    int i;
    for(i=0;i<10;i++){
        printf("%d ",fib(i));
    }
}