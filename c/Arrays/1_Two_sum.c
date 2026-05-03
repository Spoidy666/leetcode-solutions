#include<stdio.h>
#include<stdlib.h>
int* twoSum(int* nums,int target,int n,int* returnSize){
    int* result = (int*)malloc(2*sizeof(int*));
    for(int i = 0 ; i < n ; i++){
        for(int j =i+1; j<n;j++){
            if((nums[i]+nums[j]) == target){
                result[0]=i;
                result[1]=j;
                *returnSize=2;
                return result;
            }
        }
    }
    returnSize=0;
    return NULL;
}

void main(){
    int n,target;
    printf("Enter the number of elements in the array : ");
    scanf("%d",&n);
    int* nums = (int*)malloc(n*sizeof(int));
    printf("Enter the elements in order : ");
    for( int i = 0; i < n ; i ++){
        scanf("%d",&nums[i]);
    }
    printf("Enter the target value : ");
    scanf("%d",&target);
    int* returnSize;
    int* result = twoSum(nums,target,n,returnSize);
    if(*returnSize ==2){
        printf("Values are %d and %d ", result[0],result[1]);
    }
    else{
        printf("NO values ");
    }

}