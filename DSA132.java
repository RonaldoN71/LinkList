class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
class DSA132{
    static void Divide(Node head){
        Node l1 = head;
        Node slow = head;
        Node fast = head;
        Node prev = null;

        while(fast!=null && fast.next!=null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;
        Node l2 = reverse(slow);
        
        display(merge(l1,l2));
    }
    static Node reverse(Node head){
        Node current = head;
        Node prev = null;
        Node next = null;
        while(current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
    static Node merge(Node l1,Node l2){
        Node head = l1;
        while(l1 !=null){
            Node l1_next = l1.next;
            Node l2_next = l2.next;
            l1.next = l2;
            if(l1_next==null){
                break;
            }
            l2.next = l1_next;
            l1 = l1_next;
            l2 = l2_next;
        }
        return head;
    }
    static void display(Node head){
        Node current = head;
        System.out.println("The list after transformed:");
        while(current !=null){
            System.out.print(current.data+" ");
            current = current.next;
        }
    }
    public static void main(String[]args){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        Divide(head);
}
}