#include<stdio.h>
#include<stdlib.h>

struct ListNode{
    int val;
    struct ListNode *next;
};

struct ListNode* addTwoNumbers(struct ListNode* l1, struct ListNode* l2) {
    struct ListNode* dummy = (struct ListNode*)malloc(sizeof(struct ListNode));
    dummy->val = 0;
    dummy->next = NULL;
    struct ListNode* r = dummy;
    int rem = 0, val =0;
    while(l1 || l2 || rem){
        val=rem;
        if(l1){
            val+=l1->val;
            l1=l1->next;
        }
        if(l2){
            val+=l2->val;
            l2=l2->next;
        }
        struct ListNode* n = (struct ListNode*)malloc(sizeof(struct ListNode));
        n->val=val%10;
        r->next=n;
        rem=val/10;
        r=r->next;
        r->next=NULL;
    }
    return dummy->next;
}

struct ListNode* createList(){
    int n;
    printf("Enter the number of elements in the list : ");
    scanf("%d",&n);
     struct ListNode* dummy = malloc(sizeof(struct ListNode));
    dummy->next = NULL;
    struct ListNode* curr = dummy;
    printf("Enter each element one by one : ");
    for(int i =0;i<n;i++){
        struct ListNode* a = malloc(sizeof(struct ListNode));
        scanf("%d",&a->val);
        a->next=NULL;
        curr->next=a;
        curr=curr->next;
    }
    return dummy->next;
}
void printList(struct ListNode* l){
    while(l){
        printf("%d -> ",l->val);
        l=l->next;
    }
}

int main(){
    struct ListNode* l1= (struct ListNode*)malloc(sizeof(struct ListNode));
    struct ListNode* l2 = (struct ListNode*)malloc(sizeof(struct ListNode));    
    struct ListNode* l3 = (struct ListNode*)malloc(sizeof(struct ListNode));
    l1=createList();
    l2=createList();
    l3 = addTwoNumbers(l1,l2);
    printList(l3);
    return 0;
}