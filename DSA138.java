class Node{
    int data ;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class DSA138 {
    
    public static void main(String[]args){
        Node head = new Node(12);
        head.next = new Node(15);
        head.next.next = new Node(10);
        head.next.next.next = new Node(11);
        head.next.next.next.next = new Node (5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(2);
        head.next.next.next.next.next.next.next = new Node(3);
    }
}
