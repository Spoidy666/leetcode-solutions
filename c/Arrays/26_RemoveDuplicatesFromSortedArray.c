#include<stdio.h>
int removeDuplicates(int* nums, int numsSize) {
        int unique =1;
        int j = 1;
        for(int i = 1; i< numsSize ;i++){
            if(nums[i]==nums[i-1]){
                continue;
            }
            nums[j++]=nums[i];
            unique++;
}
        return unique;
}

int main(){
    printf("Enter the number of elements in the array : ");
    int n;
    scanf("%d",&n);
    int nums[n];
    printf("Enter the elements : ");
    for (int i = 0 ; i< n ; i++){
        scanf("%d",&nums[i]);
    }
    printf("The number of unique elements in array after removing duplicates is : %d",removeDuplicates(nums,n));
    return 0;
}