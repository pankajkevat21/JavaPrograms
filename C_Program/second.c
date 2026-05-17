#include <stdio.h>
#include <stdlib.h>
struct tree
{
    int data;
    struct tree *left, *right;
};
void inorder(struct tree *t);
int height(struct tree *t);

int main()
{
    int i, front, rear;
    struct tree *q[15];
    struct tree *node = NULL, *root = NULL, *t = NULL;
    printf("\nEnter element(0=stop):");
    scanf("%d", &i);
    while (i != 0)
    {
        node = malloc(sizeof(struct tree));
        node->left = NULL;
        node->right = NULL;
        node->data = i;
        if (root == NULL)
        {
            root = node;
        }
        else
        {
            t = root;
            while(t!=NULL)
            {
                if(t->data < node->data)
                {
                    if(t->right==NULL)
                    {
                         t->right = node;
                         break;
                    }
                    else{
                        t =t->right;
                    }

                }
                else{
                    if(t->left==NULL)
                    {
                        t->left =node;
                        break;
                    }
                    else{
                        t= t->left;
                    }
                }
            }
        }
        printf("\nEnter element(0=stop):");
        scanf("%d", &i);
    }

    printf("\nInorderTraversel:");
    inorder(root);
    printf("\nHeight of the tree:%d", height(root));


    printf("\nProgram executed succesffuly");
    return 0;
}
void inorder(struct tree *t)
{
    if (t != NULL)
    {
        inorder(t->left);
        printf("%d ", t->data);
        inorder(t->right);
    }
}
int height(struct tree *t)
{
    if(t==NULL)
     return -1;
    int lh = height(t->left);
    int rh = height(t->right);
    if(lh>rh)
     return lh+1;
    else
     return rh+1;
}