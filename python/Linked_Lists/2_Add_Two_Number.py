class ListNode:
    def __init__(self,val=0,next=None):
        self.val=val
        self.next=next

class question3:
    def addTwoNumbers(self, l1, l2):
        r=ListNode()
        l3=r
        rem=0
        val=0
        while(l1 or l2 or rem):
            val=rem
            if l1:
                val+=l1.val
                l1=l1.next
            if l2:
                val+=l2.val
                l2=l2.next
            l3.next=ListNode(val%10)
            l3=l3.next
            rem = val//10
        return r.next


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
    l1_number= list(map(int,input("Enter the first number : ").split(" ")))
    l2_number= list(map(int,input("Enter the second number : ").split(" ")))
    l1=builtList(l1_number)
    l2=builtList(l2_number)
    obj=question3()
    output=obj.addTwoNumbers(l1,l2)
    print_list(output)

if __name__== "__main__":
    main()