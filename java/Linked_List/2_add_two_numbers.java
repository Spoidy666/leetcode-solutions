import java.util.Scanner;
class Solution {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy= new ListNode();
        dummy.next=null;
        ListNode curr= dummy;
        int rem=0, val=0;
        while(l1 != null|| l2!= null || rem !=0){
            val = rem;
            if(l1!= null){
                val += l1.val;
                l1=l1.next;
            }
            if(l2!= null){
                val+=l2.val;
                l2=l2.next;
            }
            ListNode a = new ListNode();
            a.val=val%10;
            curr.next=a;
            rem = val/10;
            curr=curr.next;
        }
        return dummy.next;
    }
    public static ListNode createList(Scanner sc) {
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            ListNode node = new ListNode(val);

            curr.next = node;
            curr = node;
        }

        return dummy.next;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("First list:");
        ListNode l1 = createList(sc);
        System.out.println("Second list:");
        ListNode l2 = createList(sc);
        ListNode result = addTwoNumbers(l1, l2);
        System.out.print("Result: ");
        printList(result);
        sc.close();
    }
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }

}
class ListNode{
    int val;
    ListNode next;
    ListNode (){
        this.val=0;
        this.next=null;
    }
    ListNode(int val){
        this.val = val;
        this.next= null;
    }
    ListNode(int val,ListNode next){
        this.val = val;
        this.next = next;
    }
}
