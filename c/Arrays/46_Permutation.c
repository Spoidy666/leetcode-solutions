#include <stdio.h>

void swap(int *a, int *b) {
    int temp = *a;
    *a = *b;
    *b = temp;
}

void permute(int nums[], int start, int n) {

    if (start == n) {
        for (int i = 0; i < n; i++) {
            printf("%d ", nums[i]);
        }
        printf("\n");
        return;
    }

    for (int i = start; i < n; i++) {

        swap(&nums[start], &nums[i]);

        permute(nums, start + 1, n);

        swap(&nums[start], &nums[i]); 
    }
}

int main() {

    int n;

    printf("Enter the number of elements: ");
    scanf("%d", &n);

    int nums[n];

    printf("Enter the elements: ");

    for (int i = 0; i < n; i++) {
        scanf("%d", &nums[i]);
    }

    printf("Permutations:\n");

    permute(nums, 0, n);

    return 0;
}