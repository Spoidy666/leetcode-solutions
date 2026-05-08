#include<stdio.h>
bool isPalindrom(int x){
    int y = x;
    int sum = 0, rem= 0;
    while (y>0){
        rem = y%10;
        sum = sum*10 +rem;
        y = y/10;
    }   
    return sum==x;

}
int main(){
    int x;
    printf("Enter the number to be tested : ");
    scanf("%d",&x);
    printf("%d",isPalindrom(x));
    return 0;
}