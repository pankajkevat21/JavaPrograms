#include <stdio.h>
#include <stdlib.h>

struct tree
{
    int data;
    struct tree *left, *right;
};

void inorder(struct tree *t);
int height(struct tree *t);   // function prototype

int main()
{
    int i;
    struct tree *node = NULL, *root = NULL, *t = NULL;

    printf("\nEnter element(0=stop): ");
    scanf("%d", &i);

    while (i != 0)
    {
        node = (struct tree*)malloc(sizeof(struct tree));
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
            while (t != NULL)
            {
                if (t->data < node->data)
                {
                    if (t->right == NULL)
                    {
                        t->right = node;
                        break;
                    }
                    else
                        t = t->right;
                }
                else
                {
                    if (t->left == NULL)
                    {
                        t->left = node;
                        break;
                    }
                    else
                        t = t->left;
                }
            }
        }

        printf("\nEnter element(0=stop): ");
        scanf("%d", &i);
    }

    printf("\nInorder Traversal: ");
    inorder(root);

    // height print
    printf("\nHeight of tree = %d", height(root));

    printf("\nProgram executed successfully");
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

// HEIGHT FUNCTION
int height(struct tree *t)
{
    if (t == NULL)
        return -1;   // edge based height

    int lh = height(t->left);
    int rh = height(t->right);

    if (lh > rh)
        return lh + 1;
    else
        return rh + 1;
}
