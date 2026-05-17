#include<stdio.h>
float interest(float *p,int *r, int *t);
int main(){
float p, amt;
int r, t;
printf("Enter principal ,rate and time:");
scanf("%f%d%d",&p,&r,&t);
amt = interest(&p,&r,&t);
printf("Total amount at the time of maturity = %f\n",amt);
}
float interest(float *p,int *r, int *t){
    float si , total ;
    si = (*p * *r * *t)/100;
    printf("total interest:%f\n",si);
    total = *p +si;
    return total;
}