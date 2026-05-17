#include <stdio.h>

int main()
{
    int n, m;
    int i, j;

    int allocation[10][10];
    int max[10][10];
    int need[10][10];
    int available[10];
    int finish[10] = {0};
    int work[10];
    int safe[10];
    int count = 0;

    /* -------- Input -------- */
    printf("Enter number of processes: ");
    scanf("%d", &n);

    printf("Enter number of resources: ");
    scanf("%d", &m);

    if(n > 10 || m > 10)
    {
        printf("Limit exceeded! Max = 10\n");
        return 0;
    }

    printf("\nEnter Allocation Matrix:\n");
    for (i = 0; i < n; i++)
        for (j = 0; j < m; j++)
            scanf("%d", &allocation[i][j]);

    printf("\nEnter Max Matrix:\n");
    for (i = 0; i < n; i++)
        for (j = 0; j < m; j++)
            scanf("%d", &max[i][j]);

    printf("\nEnter Available Resources:\n");
    for (j = 0; j < m; j++)
        scanf("%d", &available[j]);

    /* -------- Calculate Need Matrix -------- */
    printf("\nNeed Matrix:\n");
    for (i = 0; i < n; i++)
    {
        for (j = 0; j < m; j++)
        {
            need[i][j] = max[i][j] - allocation[i][j];
            printf("%d ", need[i][j]);
        }
        printf("\n");
    }

    /* -------- Initialize Work -------- */
    for (j = 0; j < m; j++)
        work[j] = available[j];

    /* -------- Banker's Algorithm -------- */
    while (count < n)
    {
        int found = 0;

        for (i = 0; i < n; i++)
        {
            if (finish[i] == 0)
            {
                int flag = 1;

                for (j = 0; j < m; j++)
                {
                    if (need[i][j] > work[j])
                    {
                        flag = 0;
                        break;
                    }
                }

                if (flag == 1)
                {
                    for (j = 0; j < m; j++)
                        work[j] += allocation[i][j];

                    safe[count] = i;
                    count++;
                    finish[i] = 1;
                    found = 1;
                }
            }
        }

        if (found == 0)
        {
            printf("\nSystem is NOT in safe state.\n");
            return 0;
        }
    }

    /* -------- Output -------- */
    printf("\nSystem is in SAFE state.\n");
    printf("Safe sequence: ");

    for (i = 0; i < n; i++)
        printf("P%d -> ", safe[i]);

   

    return 0;
}