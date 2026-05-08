#include<stdio.h>
int maxArea(int* height, int heightSize) {
    int l =0;
    int r= heightSize-1;
    int value=0;
    int a =0;
    while(l<r){
        a= (height[l]<height[r] ? height[l] : height[r])* (r-l);
        value = value>a ? value:a;

        if (height[l]<height[r]){
            l++;
        }
        else{
            r--;
        }
    }
    return value;
}

int main(){
    int heightSize;
    printf("Enter the number of elements : ");
    scanf("%d",&heightSize);
    int height[heightSize];

    for(int i =  0; i < heightSize ; i ++){
        scanf("%d",&height[i]);
    }
    printf("Most possible area is : %d",maxArea(height,heightSize));
    return 0;
}