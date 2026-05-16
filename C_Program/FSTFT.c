#include <stdio.h>

struct process {
    int id;
    int size;
};

struct block {
    int id;
    int size;
    int st;   // 0 = free, otherwise process id
};

int main()
{
    struct process p[10];
    struct block b[15];

    int n, nb, i, k = 0;

    printf("Enter total number of processes: ");
    scanf("%d", &n);

    // Input process sizes
    for(i = 0; i < n; i++)
    {
        p[i].id = i + 1;
        printf("Enter size of process %d: ", i + 1);
        scanf("%d", &p[i].size);
    }

    printf("Enter total number of memory blocks: ");
    scanf("%d", &nb);

    // Input block sizes
    for(i = 0; i < nb; i++)
    {
        b[i].id = i + 1;
        b[i].st = 0;   // initially free
        printf("Enter size of block %d: ", i + 1);
        scanf("%d", &b[i].size);
    }

    // FIRST FIT LOGIC
    while(k < n)
    {
        for(i = 0; i < nb; i++)
        {
            if(b[i].size >= p[k].size && b[i].st == 0)
            {
                b[i].st = p[k].id; // allocate block
                break;
            }
        }
        k++;
    }

    // OUTPUT
    printf("\n*** Allocation of blocks to processes ***\n");

    for(i = 0; i < nb; i++)
    {
        if(b[i].st == 0)
            printf("Block %d is NOT allocated\n", b[i].id);
        else
            printf("Block %d is allocated to Process %d\n",
                   b[i].id, b[i].st);
    }

    return 0;
}
