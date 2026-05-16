#include<stdio.h>
#include<stdlib.h>

struct ListNode{
    int val;
    struct ListNode* next;
};
struct ListNode* removeNthFromEnd(struct ListNode* head, int n) {
    int length=0;
    struct ListNode* dummy = malloc(sizeof(struct ListNode));
    dummy->val = 0;
    dummy->next = head;
    struct ListNode* curr = head;
    while(curr){
        length++;
        curr=curr->next;
    }
    length=length-n;
    curr= dummy;
    for (int i =0 ; i < length ; i ++){
        curr= curr->next;
    }
    curr->next=curr->next->next;
    return dummy->next;
}

struct ListNode* createList(){
    printf("Enter the number of elements in the LinkedList : ");
    int n;
    scanf("%d",&n);
    struct ListNode* head = (struct ListNode*)malloc(sizeof(struct ListNode));
    head->next = NULL;
    printf("Enter the elements : ");
    struct ListNode* curr = head;
    for(int i = 0 ; i< n ; i++){
        struct ListNode* test= (struct ListNode*)malloc(sizeof(struct ListNode));
        scanf("%d",&test->val);
        test->next = NULL;
        curr->next = test;
        curr= curr->next;
    }
    return head->next;
}
void printList(struct ListNode* head){
    while(head){
        printf("%d -> ",head->val);
        head=head->next;
    }
}
int main(){
    struct ListNode* head = (struct ListNode*)malloc(sizeof(struct ListNode));
    head= createList();
    printf("Enter the element from the end to be deleted : ");
    int n;
    scanf("%d",&n);
    head = removeNthFromEnd(head,n);
    printList(head);
    return 0;

}