class Node{
    int data;
    Node next;
    Node (int data){
        this.data=data;
        this.next=null;
    }
}
public class DSA127 {
    public static void DeleteNode(Node toDelNode,Node head){
        if(toDelNode==null||toDelNode.next==null){
            System.out.println("Error");
            return;
        }
        toDelNode.data = toDelNode.next.data;
        toDelNode.next = toDelNode.next.next;

        Node current=head;
        while(current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }

    }
    public static void main(String[]args){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        Node toDelNode = head.next;
        DeleteNode(toDelNode,head);
    }
}
