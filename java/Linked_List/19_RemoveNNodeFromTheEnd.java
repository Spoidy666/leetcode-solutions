import java.util.Scanner;

class ListNode{
    int val;
    ListNode next;
    ListNode(){
        this.val = 0;
        this.next = null;
    }
    ListNode(int val){
        this.val = val;
        this.next = null;
    }
    ListNode(int val , ListNode next){
        this.val= val;
        this.next = next;
    }
}

class RemoveNthNodeFromEnd{
      public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }
    public static ListNode removeNthFromEnd(ListNode head, int n) {
         ListNode dummy = new ListNode(0, head);
        ListNode result = head;
        int length = 0;
        if (n==0){
            return head;
        }
        while(result!= null){
            length++;
            result = result.next;
        }
        length = length -n ;
        result = dummy;
        for(int i = 0 ; i < length; i++){
            result = result.next;
        }
        result.next = result.next.next;

        return dummy.next;
    }
    public static ListNode createNode(Scanner sc){
        ListNode a = new ListNode();
        a.val = sc.nextInt();
        a.next= null;
        return a;
    }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n,target;
        ListNode head = new ListNode();
        System.out.println("Enter the number of elements in the linked list : ");
        n = sc.nextInt();
        ListNode dummy = head;
        System.out.println("Enter the elements : ");
        for(int i = 0 ; i < n ; i++){
            dummy.next = createNode(sc);
            dummy = dummy.next;
        }
        System.out.println("Enter the number from the last : ");
        target = sc.nextInt();
        dummy = removeNthFromEnd(head.next,target);
        printList(dummy);
    }
}