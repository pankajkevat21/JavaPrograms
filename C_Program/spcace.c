#include <stdio.h>
#include <string.h>

int main()
{
	char subject[5][20];
	int marks[5];
	float percentage;
	char space[15] = "--------------";
	char sp;
	int c = strlen(space);
	int a[5], total = 1;
	int cols, len, reminder;

	for (int i = 0; i < 5; i++)
	{
		printf("\nEnter subject name: ");
		scanf("%s", subject[i]);
		printf("Enter marks: ");
		scanf("%d", &marks[i]);
	}

	printf("\n--- Result ---\n");
	for (int i = 0; i < 5; i++)
	{
		int len2 = strlen(subject[i]);
		printf("%s", subject[i]);

		reminder = 28 - len2;
		for (int i = 0; i <= reminder; i++)
		{
			printf(" ");
		}

		printf("%d", marks[i]);
		printf("\n");
		total += marks[i];
	}
	printf("\nTotal:%d", total);
	percentage = (total / 500.0) * 100;

	printf("\npercentage: %.2f", percentage);

	return 0;
}
