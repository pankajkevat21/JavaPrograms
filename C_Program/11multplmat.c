#include <stdio.h>

int main()
{
    int n;
    printf("Please enter value of n (for n x n matrices): ");
    if (scanf("%d", &n) != 1 || n <= 0) {
        printf("Invalid n\n");
        return 1;
    }

    int prod[n][n];
    int first[n][n];
    int second[n][n];

    printf("Please enter %d values for 1st matrix (row-wise):\n", n * n);
    for (int i = 0; i < n; i++)
        for (int j = 0; j < n; j++)
            scanf("%d", &first[i][j]);

    printf("\nFirst matrix:\n");
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++)
            printf("%d ", first[i][j]);
        printf("\n");
    }

    printf("\nPlease enter %d values for 2nd matrix (row-wise):\n", n * n);
    for (int i = 0; i < n; i++)
        for (int j = 0; j < n; j++)
            scanf("%d", &second[i][j]);

    printf("\nSecond matrix:\n");
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++)
            printf("%d ", second[i][j]);
        printf("\n");
    }

    // initialize product matrix to 0
    for (int i = 0; i < n; i++)
        for (int j = 0; j < n; j++)
            prod[i][j] = 0;

    // matrix multiplication: prod = first * second
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            for (int k = 0; k < n; k++) {
                prod[i][j] += first[i][k] * second[k][j];
            }
        }
    }

    // print result
    printf("\nProduct matrix:\n");
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++)
            printf("%d ", prod[i][j]);
        printf("\n");
    }

    return 0;
}
