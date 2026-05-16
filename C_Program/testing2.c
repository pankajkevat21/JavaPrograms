#include <stdio.h>
#include <conio.h>
#include <ctype.h>
#define size 15

float st[size];
int top = -1;

void push(float v) {
    if (top < size - 1) {
        top++;
        st[top] = v;
    } else {
        printf("Stack overflow!\n");
    }
}

float pop() {
    if (top >= 0) {
        return st[top--];
    } else {
        printf("Stack underflow!\n");
        return 0;
    }
}

int main() {
    char post[size];
    char ch;
    float a, b;
    int i = 0;
    
    // Read the entire postfix expression
    printf("Enter postfix expression (comma separated, e.g.: 3,5,+): ");
    while ((ch = getchar()) != '\n' && i < size - 1) {
        post[i++] = ch;
    }
    post[i] = '\0';
    
    // Process the postfix expression
    i = 0;
    while ((ch = post[i]) != '\0') {
        if (isdigit(ch)) {
            push((float)(ch - '0'));
        } else if (ch == ',') {
            // Skip commas
        } else {
            a = pop();
            b = pop();
            switch(ch) {
                case '+': 
                    push(b + a); 
                    break;
                case '-': 
                    push(b - a); 
                    break;
                case '*': 
                    push(b * a); 
                    break;
                case '/': 
                    if (a != 0) {
                        push(b / a);
                    } else {
                        printf("Division by zero error!\n");
                        return 1;
                    }
                    break;
            }
        }
        i++;
    }
    
    printf("\nResult = %f\n", st[top]);
    getch();
    return 0;
}