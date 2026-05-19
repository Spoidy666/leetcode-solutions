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

class reverseInKGroup {
    public static ListNode reverseKGroup(ListNode head, int k) {
        ListNode prev = new ListNode();
        prev = null;
        ListNode curr = head;
        ListNode next = curr.next;
        int i =0;
        for(i=0;i<k;i++){
            if(curr ==null){
                return head;
            }
            curr = curr.next;
        }
        curr=head;
        i =0;
        while(i<k && curr!=null){
            i++;
            next=curr.next;
            curr.next=curr;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        if(next!=null){
            head.next = reverseKGroup(next,k);
        }
        return prev;
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
        System.out.println("Enter k : ");
        int k = sc.nextInt();
        head = reverseKGroup(head,k);
        printlist(head);
    }
}