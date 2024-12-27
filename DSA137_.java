class Node{
    int data;
    Node forw;
    Node back;
    Node (int data){
        this.data = data;
        this.forw = null;
        this.back = null;
    }
}
public class DSA137_ {
    static void DoublyReverse(Node head,Node tail){
        Node curr = head;
        Node next = null;
        while(curr!=null){
            next = curr.forw;
            curr.forw = curr.back;
            curr.back = next;
            curr = next;
        }
        
        printlist(tail);
    }
    static void printlist(Node head){
        System.out.println("The list :");
        while(head!=null){
            System.out.print(head.data+" ");
            head = head.forw;
        }
    }
    public static void main(String[]args){
        Node head = new Node(1);
        head.forw = new Node(2);
        head.forw.back = head;
        head.forw.forw = new Node(3);
        head.forw.forw.back = head.forw;

        Node tail = head.forw.forw;
        DoublyReverse(head,tail);

    }
}
