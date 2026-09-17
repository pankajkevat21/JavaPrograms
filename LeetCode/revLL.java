public class revLL {
    class Node {
        int val;
        Node next;

        // Default constructor
        Node() {}

        // Constructor with value
        Node(int val) {
            this.val = val;
        }

        // Constructor with value and next pointer
        Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
}
