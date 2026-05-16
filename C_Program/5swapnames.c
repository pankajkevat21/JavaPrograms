#include <stdio.h>

int main() {
    char name[5][20], temp[20];
    int i, j;

    printf("Enter 5 names:\n");
    for(i = 0; i < 5; i++) {
        scanf("%s", name[i]);
    }

    // Swap name[1] and name[3] manually (2nd and 4th name)
    for(j = 0; j < 20; j++) {
        temp[j] = name[1][j];
        name[1][j] = name[3][j];
        name[3][j] = temp[j];
    }

    printf("\nAfter Swapping 2nd and 4th names:\n");
    for(i = 0; i < 5; i++) {
        printf("%s\n", name[i]);
    }

    return 0;
}
