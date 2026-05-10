#include<stdio.h>
#include <string.h>
int roman(char c){
    switch(c){
        case 'I':
            return 1;

        case 'V':
            return 5;

        case 'X':
            return 10;

        case 'L':
            return 50;

        case 'C':
            return 100;

        case 'D':
            return 500;

        case 'M':
            return 1000;

        default:
            return 0;
    }
}

int romanToInt(char* s) {
    int output= 0;
    int n = strlen(s);
    for (int i = 0 ; i < n ; i++ ){
        if (i < n-1 && roman(s[i])<roman(s[i+1])){
            output-=roman(s[i]);
        }
        else{
            output+=roman(s[i]);
        }
    }
    return output;
}

int main(){
    char s[100];
    printf("Enter the roman string : ");
    fgets(s, sizeof(s), stdin);
    s[strcspn(s, "\n")] = '\0';
    printf("The Integer value is : %d",romanToInt(s));
    return 0;
}