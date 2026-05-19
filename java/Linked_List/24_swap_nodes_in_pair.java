import java.util.Scanner;

class ListNode{
    int val;
    ListNode next;
    ListNode(){
        this.val=0;
        this.next=null;
    }
    ListNode(int val){
        this.val=val;
        this.next=null;
    }
    ListNode(int val,ListNode next){
        this.val= val;
        this.next=next;
    }
}

class swapNodesInPairs {
    public static ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0, head);

        ListNode prev = dummy;
        while(prev.next!=null && prev.next.next != null ){
            ListNode first = prev.next;
            ListNode second = prev.next.next;
            first.next=second.next;
            second.next=first;
            prev.next=second;
            prev = first;

        }
        return dummy.next;
    }
    public static ListNode createLinkedList(Scanner sc){
        System.out.println("Enter the number of elements in the list : ");
        int n = sc.nextInt();
        ListNode head = new  ListNode(0);
        ListNode dummy = head;
        System.out.println("Enter the elements : ");
        for(int i = 0 ; i < n ;i ++){
            ListNode a = new ListNode(sc.nextInt());
            dummy.next=a;
            dummy=dummy.next;
        }
        return head.next;
    }
    public static void printlist(ListNode l){
        while(l!=null){
            System.out.print(l.val+" -> ");
            l=l.next;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        ListNode head = new ListNode();
        head= createLinkedList(sc);
        head = swapPairs(head);
        printlist(head);
    }
}