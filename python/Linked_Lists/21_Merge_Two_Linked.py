class ListNode:
    def __init__(self,val=0,next=None):
        self.val=val
        self.next=next

class MergeTwoLinked:
   def mergeTwoLists(self, list1, list2):
        dummy=ListNode()
        current=dummy
        while list1 and list2:
            if list1.val<list2.val:
                current.next=list1
                list1=list1.next
            else:
                current.next=list2
                list2=list2.next
            current=current.next
        if list1:
            current.next = list1
        elif list2:
            current.next = list2
        return dummy.next 
        return list1 


def builtList(num):
    l1=ListNode()
    l=l1
    length = len(num)
    for i in range(length):
        l.next=ListNode(num[i])
        l=l.next
    return l1.next

def print_list(node):
    while node:
        print(node.val, end=" -> " if node.next else "")
        node = node.next
    print()

def main():
    l1_number= list(map(int,input("Enter the first list : ").split(" ")))
    l2_number= list(map(int,input("Enter the second list : ").split(" ")))
    l1=builtList(l1_number)
    l2=builtList(l2_number)
    obj=MergeTwoLinked()
    output=obj.mergeTwoLists(l1,l2)
    print_list(output)

if __name__== "__main__":
    main()