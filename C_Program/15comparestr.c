#include<stdio.h>

int compare(char a[], char b[]);

int main(){
    char name[] = "pankaj";
    char surname[] = "KEVAT";

    int c = compare(name, surname);
    printf("string comparision: %d", c);

    return 0;
}

int compare(char a[], char b[]){
    int i = 0;
    
    while(a[i] != '\0' && b[i] != '\0') {
        if(a[i] != b[i]) {
            return (a[i] - b[i]);   // Correct
        }
        i++;
    }

    return (a[i] - b[i]);  // Correct
}
