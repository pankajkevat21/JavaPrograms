#include <stdio.h>
int main()
{
    int n, j, i;
    printf("how many elements in array:");
    scanf("%d", &n);
    int arr[n];
    printf("enter %d elements in array:",n);
    for (i = 0; i < n; i++)
    {
        scanf("%d", &arr[i]);
    }
    printf("Duplicate elements are:");

    for (i = 0; i < n; i++)
    {
        for (j = i + 1; j < n; j++)
        {
            if (arr[i] == arr[j])
            {
                printf("%d ", arr[j]);
                break;
            }
        }
    }
    return 0;
}
