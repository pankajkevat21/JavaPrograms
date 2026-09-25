class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Solution {

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;  // save next
            curr.next = prev;           // reverse link
            prev = curr;                // move prev forward
            curr = next;                // move curr forward
        }

        return prev; // new head
    }

    // Linked list ko print karne ke liye helper method
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val);
            if (temp.next != null) System.out.print(" -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Linked list banate hain: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.print("Original List : ");
        printList(head);

        // Reverse karte hain
        ListNode reversedHead = sol.reverseList(head);

        System.out.print("Reversed List : ");
        printList(reversedHead);
    }
}