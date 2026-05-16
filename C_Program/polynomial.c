#include <stdio.h>
#include <stdlib.h>

struct poly
{
    int coeff;
    int power;
    struct poly *next;
};

/* Create a new node */
struct poly *createNode(int c, int p)
{
    struct poly *node = malloc(sizeof(struct poly));
    node->coeff = c;
    node->power = p;
    node->next = NULL;
    return node;
}

/* Insert node at end */
struct poly *insert(struct poly *head, int c, int p)
{
    struct poly *node = createNode(c, p);

    if (head == NULL)
        return node;

    struct poly *temp = head;
    while (temp->next != NULL)
        temp = temp->next;

    temp->next = node;
    return head;
}

/* Add two polynomials */
struct poly *addPoly(struct poly *p1, struct poly *p2)
{
    struct poly *p3 = NULL;

    while (p1 != NULL && p2 != NULL)
    {
        if (p1->power == p2->power)
        {
            p3 = insert(p3, p1->coeff + p2->coeff, p1->power);
            p1 = p1->next;
            p2 = p2->next;
        }
        else if (p1->power > p2->power)
        {
            p3 = insert(p3, p1->coeff, p1->power);
            p1 = p1->next;
        }
        else
        {
            p3 = insert(p3, p2->coeff, p2->power);
            p2 = p2->next;
        }
    }

    while (p1 != NULL)
    {
        p3 = insert(p3, p1->coeff, p1->power);
        p1 = p1->next;
    }

    while (p2 != NULL)
    {
        p3 = insert(p3, p2->coeff, p2->power);
        p2 = p2->next;
    }

    return p3;
}

/* Display polynomial */
void display(struct poly *p)
{
    while (p != NULL)
    {
        printf("%dx^%d", p->coeff, p->power);
        if (p->next != NULL)
            printf(" + ");
        p = p->next;
    }
    printf("\n");
}

/* Main function */
int main()
{
    struct poly *p1 = NULL, *p2 = NULL, *p3 = NULL;

    /* Polynomial 1: 5x^2 + 4x + 2 */
    p1 = insert(p1, 5, 2);
    p1 = insert(p1, 4, 1);
    p1 = insert(p1, 2, 0);

    /* Polynomial 2: 3x^2 + 2x + 1 */
    p2 = insert(p2, 3, 2);
    p2 = insert(p2, 2, 1);
    p2 = insert(p2, 1, 0);

    printf("Polynomial 1: ");
    display(p1);

    printf("Polynomial 2: ");
    display(p2);

    p3 = addPoly(p1, p2);

    printf("Sum Polynomial: ");
    display(p3);

    return 0;
}
