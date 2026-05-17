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
    int fr;   // internal fragmentation
};

int main()
{
    struct process p[10];
    struct block b[15];

    int n, nb;
    int i, j, k, l;
    int flag;

    /* ---------- Input Processes ---------- */
    printf("\nEnter total number of processes: ");
    scanf("%d", &n);

   

    for (i = 0; i < n; i++)
    {
        p[i].id = i + 1;
        printf("Enter size of process %d: ", i + 1);
        scanf("%d", &p[i].size);
    }

    /* ---------- Input Blocks ---------- */
    printf("\nEnter total number of blocks: ");
    scanf("%d", &nb);

   
    for (i = 0; i < nb; i++)
    {
        b[i].id = i + 1;
        b[i].st = 0;     // block initially free
        b[i].fr = 0;

        printf("Enter size of block %d: ", i + 1);
        scanf("%d", &b[i].size);
    }

    /* ---------- Worst Fit Allocation ---------- */
    for (k = 0; k < n; k++)
    {
        int max = -1;
        flag = 0;

        for (j = 0; j < nb; j++)
        {
            // block must be free and large enough
            if (b[j].st == 0 && b[j].size >= p[k].size)
            {
                if ((b[j].size - p[k].size) > max)
                {
                    max = b[j].size - p[k].size;
                    l = j;
                    flag = 1;
                }
            }
        }

        // allocate process to selected block
        if (flag == 1)
        {
            b[l].st = p[k].id;
            b[l].fr = b[l].size - p[k].size;
        }
    }

    /* ---------- Output ---------- */
    printf("\n\n*** Worst Fit Allocation ***\n");
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

    printf("\nProgram executed successfully.\n");

    return 0;
}