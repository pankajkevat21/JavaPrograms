
#include <stdio.h>
#include <stdlib.h>
struct tree
{
	int data;
	struct tree *left;
	struct tree *right;
};
void preorder(struct tree *);
void inorder(struct tree *);
void postorder(struct tree *);
int main()
{
	struct tree *node = NULL, *t = NULL, *root = NULL;
	struct tree *q[15];
	int i, front, rear;
	printf("\nEnter element:");
	scanf("%d", &i);
	while (i != 0)
	{
		node = (struct tree *)malloc(sizeof(struct tree));
		node->data = i;
		node->left = NULL;
		node->right = NULL;

		if (root == NULL)
		{
			root = node;
		}
		else
		{
			t = root;
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
				{
					q[++rear] = t->left;
					if (t->right == NULL)
					{
						t->right = node;
						break;
					}
					else
					{
						q[++rear] = t->right;
					}
				}
			}
		}
		printf("\nEnter element:");
		scanf("%d", &i);
	}
	printf("\npreorder:");
	preorder(root);
	printf("\ninorder:");
	inorder(root);
	printf("\npostorder:");
	postorder(root);

	// printf("\nProgram executed succesffuly");
	return 0;
}
void preorder(struct tree *t)
{
	if (t != NULL)
	{
		printf("%d ", t->data);
		preorder(t->left);
		preorder(t->right);
	}
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
void postorder(struct tree *t)
{
	if (t != NULL)
	{
		postorder(t->left);
		postorder(t->right);
		printf("%d ", t->data);
	}
}