#include<stdio.h>
int main(){
    float hours, rate , salary;
    printf("Enter no of hours worked:");
    scanf("%f",&hours);
    printf("Enter normal hourly rate:");
    scanf("%f",&rate);
    if (hours<=40)
    {
        salary=hours*rate;
        printf("\nNO overtime normal salary calculated:");
    }else{
        float over_hourse = hours-40;
        salary = (40*rate)+(over_hourse*rate*1.5);
        printf("\novertime hourse =%2f",over_hourse);
    }
    printf("\nTotal salary=%2f\n",salary);
    return 0;
    
}