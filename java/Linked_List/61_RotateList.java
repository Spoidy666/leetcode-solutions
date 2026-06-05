class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode current = head;
        ListNode prev = new ListNode();
        int length = 0;

        while (current != null) {
            length++;
            prev = current;
            current = current.next;
        }

        if (length == 0) {
            return head;
        }

        prev.next = head;

        k = k % length;
        length = length - k - 1;

        current = head;
        int val = 0;

        while (val < length) {
            current = current.next;
            val++;
        }

        ListNode result = current.next;
        current.next = null;

        return result;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null)
                System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int k = 2;

        RotateList obj = new RotateList();

        System.out.print("Original List: ");
        printList(head);

        ListNode rotated = obj.rotateRight(head, k);

        System.out.print("Rotated List: ");
        printList(rotated);
    }
}