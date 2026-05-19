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

class MergeTwoLists {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode();
        ListNode dummy = result;
        while(list1 !=null && list2!= null){
            ListNode a = new ListNode();
            if (list1.val<list2.val){
                a.val=list1.val;
                list1=list1.next;
            }
            else{
                a.val = list2.val;
                list2 = list2.next;
            }
            a.next=null;
            dummy.next=a;
            dummy= dummy.next;
        }
        while(list1!=null){
              ListNode a = new ListNode();
                a.val=list1.val;
                list1=list1.next;
                a.next=null;
            dummy.next=a;
            dummy= dummy.next;
            
        }
        while(list2!=null){
            ListNode a = new ListNode();
                a.val=list2.val;
                list2=list2.next;
                a.next=null;
            dummy.next=a;
            dummy= dummy.next;
        }
        return result.next;
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
        ListNode list1 = new ListNode();
        list1= createLinkedList(sc);
        ListNode list2 = new ListNode();
        list2 = createLinkedList(sc);
        list2=mergeTwoLists(list1,list2);
        printlist(list2);
    }
}