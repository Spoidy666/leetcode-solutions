class ListNode:
    def __init__ (self,val=0,next=None):
        self.val = val
        self.next = next
class RemoveNthNodeFromTheEnd:
    def removeNthFromEnd(self, head, n):
        dummy = ListNode(0,head)
        result = head
        length=0
        if n == 0:
            return head
        while(result):
            length+=1
            result = result.next
        result = dummy
        length= length-n
        for i in range(length):
            result=result.next
        result.next=result.next.next
        return dummy.next

def createList():
    n = int(input("Enter the number of elements : "))
    head = ListNode()
    realhead = head
    print("Enter the elements : ")
    for i in range(n):
        k=int(input())
        a = ListNode(k,None)
        head.next=a
        head= head.next
    return realhead.next
def printList(head):
    while(head!=None):
        print(head.val,end=" ")
        head=head.next
def main():
    head = ListNode()
    head = createList()
    n = int(input("Enter the element to be deleted : "))
    obj = RemoveNthNodeFromTheEnd()
    head = obj.removeNthFromEnd(head,n)
    printList(head)

if __name__ == "__main__":
    main()
