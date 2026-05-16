#include <stdio.h>
#include <stdlib.h>

struct tree
{
    int data;
    struct tree *left, *right;
};

void nonpre(struct tree *root);
void nonin(struct tree *root);
void nonpost(struct tree *root);

int main()
{
    struct tree *node = NULL, *root = NULL, *p = NULL;
    int i;

    printf("Enter element: ");
    scanf("%d", &i);

    while (i != 0)
    {
        node = (struct tree *)malloc(sizeof(struct tree));
        node->data = i;
        node->left = node->right = NULL;

        if (root == NULL)
        {
            root = node;
        }
        else
        {
            p = root;
            while (1)
            {
                if (node->data < p->data)
                {
                    if (p->left == NULL)
                    {
                        p->left = node;
                        break;
                    }
                    p = p->left;
                }
                else
                {
                    if (p->right == NULL)
                    {
                        p->right = node;
                        break;
                    }
                    p = p->right;
                }
            }
        }

        printf("Enter element: ");
        scanf("%d", &i);
    }

    printf("\nPreorder: ");
    nonpre(root);

    printf("\nInorder: ");
    nonin(root);

    printf("\nPostorder: ");
    nonpost(root);

    return 0;
}

// Non recursive preorder traversal
void nonpre(struct tree *root)
{
    struct tree *stack[50];
    int top = -1;
    struct tree *t;

    stack[++top] = NULL;

    t = root;

    while (t != NULL)
    {

        while (t != NULL)
        {
            printf("%d ", t->data);

            if (t->right != NULL)
            {
                stack[++top] = t->right;
            }

            t = t->left;
        }

        t = stack[top--];
    }
}

// Non recursive postorder traversal

void nonpost(struct tree *root)
{
    struct tree *s1[50], *s2[50];
    int top1 = -1, top2 = -1;
    struct tree *t;

    if (root == NULL)
        return;

    s1[++top1] = root;

    while (top1 != -1)
    {
        t = s1[top1--];
        s2[++top2] = t;

        if (t->left != NULL)
            s1[++top1] = t->left;

        if (t->right != NULL)
            s1[++top1] = t->right;
    }

    while (top2 != -1)
    {
        t = s2[top2--];
        printf("%d ", t->data);
    } 
}

// Non recursive inorder traversal

void nonin(struct tree *root)
{
    struct tree *stack[50];
    int top = -1;
    struct tree *t = root;

    while (t != NULL || top != -1)
    {
        while (t != NULL)
        {
            stack[++top] = t; // Push
            t = t->left;
        }

        t = stack[top--];       // Pop
        printf("%d ", t->data); // Root
        t = t->right;           // Right
    }
}
