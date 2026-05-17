#include <stdio.h>

struct student
{
    int id;
    char name[20];
};

int main()
{
    FILE *fp;
    struct student s = {3,"Ravi"};

    fp = fopen("student.dat","ab");

    fwrite(&s,sizeof(s),1,fp);

    fclose(fp);
    return 0;
}
