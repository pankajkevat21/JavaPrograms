#include <stdio.h>

struct process
{
    int id;
    int size;
};

struct block
{
    int id;
    int size;
    int st;   // allocated process id (0 = free)
    int fr;   // fragmentation
};

int main()
{
    struct process p[10];
    struct block b[15];

    int n, nb;
    int i, j, k, l;
    int flag;

    /* -------- Input Processes -------- */
    printf("Enter total number of processes: ");
    scanf("%d", &n);

    if (n > 10)
    {
        printf("Process limit exceeded! Max = 10\n");
        return 0;
    }

    for (i = 0; i < n; i++)
    {
        p[i].id = i + 1;
        printf("Enter size of process %d: ", i + 1);
        scanf("%d", &p[i].size);
    }

    /* -------- Input Blocks -------- */
    printf("\nEnter total number of blocks: ");
    scanf("%d", &nb);

    if (nb > 15)
    {
        printf("Block limit exceeded! Max = 15\n");
        return 0;
    }

    for (i = 0; i < nb; i++)
    {
        b[i].id = i + 1;
        b[i].st = 0;   // free
        b[i].fr = 0;

        printf("Enter size of block %d: ", i + 1);
        scanf("%d", &b[i].size);
    }

    /* -------- Best Fit Allocation -------- */
    for (k = 0; k < n; k++)
    {
        int min = 32700;
        flag = 0;

        for (j = 0; j < nb; j++)
        {
            // block must be free and large enough
            if (b[j].st == 0 && b[j].size >= p[k].size)
            {
                if ((b[j].size - p[k].size) < min)
                {
                    min = b[j].size - p[k].size;
                    l = j;
                    flag = 1;
                }
            }
        }

        // allocate process
        if (flag == 1)
        {
            b[l].st = p[k].id;
            b[l].fr = b[l].size - p[k].size;
        }
    }

    /* -------- Output -------- */
    printf("\n\n*** Best Fit Allocation ***\n");
    printf("\nBlock\tSize\tProcess\tFragmentation\n");

    for (i = 0; i < nb; i++)
    {
        if (b[i].st == 0)
        {
            printf("B%d\t%d\tNot Allocated\t-\n",
                   b[i].id, b[i].size);
        }
        else
        {
            printf("B%d\t%d\tP%d\t\t%d\n",
                   b[i].id, b[i].size, b[i].st, b[i].fr);
        }
    }
    return 0;
}