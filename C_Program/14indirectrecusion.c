#include<stdio.h>
int funx(int x){
    if(x==0)
     return 0;
    else 
     return abc(x);
}
int abc(int y){
    return funx(y-1);
}
int  main(){
    printf("%d",funx(5));
}