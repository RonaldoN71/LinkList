class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
class DSA131{
    static Node Delete(Node head,int n){
        Node dummy_node = new Node(0);
        dummy_node.next = head;
        Node slow = dummy_node;
        Node fast = dummy_node;

        for(int i=0;i<=n;i++){
            fast = fast.next;
        }
        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return dummy_node;
    }
    static void display(Node head){
        Node current = head.next;
        while (current!=null){
            System.out.print(current.data+ " ");
            current = current.next;
        }
    }

    public static void main(String[]args){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        


        System.out.println("The list after deletion :");
        display(Delete(head,2));
    }
}