#include <stdio.h>
#include <string.h>
int lengthOfLongestSubstring(char* s) {
    int set[256] ={0};
    int longest= 0;
    int l =0;
    for(int r =0 ;s[r]!='\0' ;r++ ){
        while(set[(unsigned char)s[r]]==1){
            set[(unsigned char)s[l]]=0;
            l++;
        }
        int len = r - l + 1;
        if (len > longest) longest = len;
        set[(unsigned char)s[r]]=1;
    }
    return longest;
}

int main(){
    char s[1000];
    printf("Enter the string: ");
    fgets(s, sizeof(s), stdin);
    s[strcspn(s, "\n")] = '\0';
    int result = lengthOfLongestSubstring(s);
    printf("Length of longest substring: %d\n", result);
    return 0;
}