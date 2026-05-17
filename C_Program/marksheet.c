#include <stdio.h> 
#include <stdlib.h>
struct mark{
    int no ;
    char subject[20];
    
};
int main()
{
    int k=1;
  struct mark *m1=NULL;
  m1 = (struct mark *)malloc(sizeof(struct mark));
  for(int i =0; i<=2;i++)
  {
    printf("\nEnter Subject %d",k++);
    scanf("%[^\n]",m1->subject);
  }
    printf("\nProgram executed succesffuly");
    return 0;
}