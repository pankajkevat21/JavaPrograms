#include <stdio.h>
#include <stdlib.h>

struct tree
{
    int data;
    struct tree *left;
    struct tree *right;
};

/* ---------- STACK ---------- */
struct tree *stack[50];
int top = -1;

void push(struct tree *t)
{
    stack[++top] = t;
}

struct tree* pop()
{
    return stack[top--];
}

int isEmpty()
{
    return top == -1;
}

/* ---------- NON RECURSIVE PREORDER ---------- */
void preorder(struct tree *root)
{
    struct tree *temp;

    if (root == NULL) return;

    top = -1;
    push(root);

    while (!isEmpty())
    {
        temp = pop();
        printf("%d ", temp->data);

        if (temp->right)
            push(temp->right);

        if (temp->left)
            push(temp->left);
    }
}

/* ---------- NON RECURSIVE INORDER ---------- */
void inorder(struct tree *root)
{
    struct tree *curr = root;

    top = -1;

    while (curr != NULL || !isEmpty())
    {
        while (curr != NULL)
        {
            push(curr);
            curr = curr->left;
        }

        curr = pop();
        printf("%d ", curr->data);
        curr = curr->right;
    }
}

/* ---------- NON RECURSIVE POSTORDER ---------- */
void postorder(struct tree *root)
{
    struct tree *s1[50], *s2[50];
    int top1 = -1, top2 = -1;
    struct tree *temp;

    if (root == NULL) return;

    s1[++top1] = root;

    while (top1 != -1)
    {
        temp = s1[top1--];
        s2[++top2] = temp;

        if (temp->left)
            s1[++top1] = temp->left;

        if (temp->right)
            s1[++top1] = temp->right;
    }

    while (top2 != -1)
        printf("%d ", s2[top2--]->data);
}

/* ---------- MAIN ---------- */
int main()
{
    struct tree *node = NULL, *t = NULL, *root = NULL;
    struct tree *q[15];
    int i, front, rear;

    printf("Enter element (0 to stop): ");
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
            front = rear = -1;
            q[++rear] = root;

            while (front != rear)
            {
                t = q[++front];

                if (t->left == NULL)
                {
                    t->left = node;
                    break;
                }
                else
                    q[++rear] = t->left;

                if (t->right == NULL)
                {
                    t->right = node;
                    break;
                }
                else
                    q[++rear] = t->right;
            }
        }

        printf("Enter element (0 to stop): ");
        scanf("%d", &i);
    }

    printf("\nPreorder : ");
    preorder(root);

    printf("\nInorder  : ");
    inorder(root);

    printf("\nPostorder: ");
    postorder(root);

    return 0;
}
