#include<stdio.h>
#include <string.h>
int top =-1;
char stack[100];
void push(char a){
    if(top==99){
        printf("Overflow ");
    }
    else{
        stack[++top] = a;
    }
}
char pop(){
    if(top == -1){
        return '\0';
    }
    else{
       return stack[top--];
    }
}
bool isValid(char* s) {
    for(int i = 0; s[i] != '\0'; i++) {

        if(s[i] == '(') {
            push(')');
        }

        else if(s[i] == '{') {
            push('}');
        }

        else if(s[i] == '[') {
            push(']');
        }

        else {

            if(top == -1) {
                return false;
            }

            if(pop() != s[i]) {
                return false;
            }
        }
    }

    return top == -1;

}
int main(){
    char s[100];
    printf("Enter the string of paranthesis : ");
    fgets(s,sizeof(s),stdin);
    s[strcspn(s, "\n")] = '\0';
    printf("Validity : %d",isValid(s));
    return 0;
}