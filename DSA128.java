class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class DSA128 {

    static void removeDupli(Node head) {
        if (head == null) {
            System.out.println("Error: List is empty.");
            return;
        }
        if (head.next == null) {
            System.out.println("Only one element present.");
            return;
        }

        Node current1 = head;

        // Outer loop - stop at the second-to-last node
        while (current1 != null) {

            Node current2 = current1; // Pointer to check for duplicates

            // Inner loop to check and remove duplicates for current1 node
            while (current2.next != null) {
                if (current2.next.data == current1.data) {
                    // Remove the duplicate node
                    current2.next = current2.next.next;
                } else {
                    // Move to the next node
                    current2 = current2.next;
                }
            }

            // Move current1 to the next node
            current1 = current1.next;
        }

        // Print the list after removing duplicates
        Node current = head;
        System.out.println("The list after removing duplicates:");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(4);
        head.next.next.next.next.next = new Node(4);

        removeDupli(head);
    }
}
