#include <stdio.h>

struct process
{
    int pid, at, bt, ct, tat, wt;
};

int main()
{
    int i, n;
    float avgwt = 0, avgtat = 0;

    printf("Enter number of processes: ");
    scanf("%d", &n);

    struct process p[100];

    // Input
    for(i = 0; i < n; i++)
    {
        p[i].pid = i + 1;
        printf("\nEnter Arrival Time and Burst Time for P%d: ", p[i].pid);
        scanf("%d %d", &p[i].at, &p[i].bt);
    }

    // Sorting by Arrival Time (FCFS rule)
    for(i = 0; i < n-1; i++)
    {
        for(int j = i+1; j < n; j++)
        {
            if(p[i].at > p[j].at)
            {
                struct process temp = p[i];
                p[i] = p[j];
                p[j] = temp;
            }
        }
    }

    // Calculation
    p[0].ct = p[0].at + p[0].bt;

    for(i = 1; i < n; i++)
    {
        if(p[i].at > p[i-1].ct)
            p[i].ct = p[i].at + p[i].bt;
        else
            p[i].ct = p[i-1].ct + p[i].bt;
    }

    for(i = 0; i < n; i++)
    {
        p[i].tat = p[i].ct - p[i].at;
        p[i].wt  = p[i].tat - p[i].bt;

        avgwt += p[i].wt;
        avgtat += p[i].tat;
    }

    avgwt /= n;
    avgtat /= n;

    // Output
    printf("\nPID\tAT\tBT\tCT\tTAT\tWT\n");
    for(i = 0; i < n; i++)
    {
        printf("P%d\t%d\t%d\t%d\t%d\t%d\n",
               p[i].pid, p[i].at, p[i].bt,
               p[i].ct, p[i].tat, p[i].wt);
    }

    printf("\nAverage Waiting Time = %.2f", avgwt);
    printf("\nAverage Turnaround Time = %.2f\n", avgtat);

    return 0;
}
