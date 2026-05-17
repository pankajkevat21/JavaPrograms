#include <stdio.h> 
#include <stdlib.h>
struct information{
    int roll_Number;
    char name[20];
    int marks[3];

};

int main()
{
    float  average;
    int k;
    struct information *student;
    printf("\nEnter number of students: ");

    scanf("%d", &k);
     student = (struct information*)malloc(k * sizeof(struct information));

    for(int i = 0; i < k; i++) {
        printf("\nEnter roll number of student %d: ", i + 1);
        scanf("%d", &student[i].roll_Number);

        printf("Enter name of student %d: ", i + 1);
        scanf(" %[^\n]", student[i].name);


        printf("Enter Hindi marks: ");
        scanf("%d", &student[i].marks[0]);

        printf("Enter English marks: ");
        scanf("%d", &student[i].marks[1]);

        printf("Enter Maths marks: ");
        scanf("%d", &student[i].marks[2]);
    }
    for(int i=0;i<k;i++){
        printf("\n%s\'s marks---->",student[i].name);
          printf("\nHindi:%d",student[i].marks[0]);
          printf("\nEnglish:%d",student[i].marks[1]);
          printf("\nMaths:%d",student[i].marks[2]);
             average =((float) (student[i].marks[0]+student[i].marks[1]+student[i].marks[2])/3);
        printf("\n%s's average marks: %.2f",student[i].name, average);

    }
    free(student);
    printf("\nProgram executed succesffuly");
    return 0;
}