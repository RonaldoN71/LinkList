class Node{
    int data;
    Node next;
    Node child;
    Node(int data){
        this.data= data;
        this.next= null;
        this.child = null;
    }
}
public class DSA135 {
    static Node merge(Node l1,Node l2){
        Node dummy_node = new Node(0);
        Node res = dummy_node;
        while(l1!=null && l2!=null){
            if(l1.data<l2.data){
                res.child = l1;
                res = l1;
                l1 = l1.child;
            }
            else{
                res.child = l2;
                res = l2;
                l2 = l2.child;
            }
           res.next =null;
        }
        if (l1 != null) {
            res.child = l1;
        } else {
            res.child = l2;
        }
        return dummy_node.child;
        
    }
    
    static Node Flattened(Node head){
        if(head==null || head.next ==null){
            return head;
        }
        Node mergerHead = Flattened(head.next);
        Node flattenedHead = merge(head,mergerHead);
        return flattenedHead;
    }
    public static void main(String[]args){
        Node head = new Node(3);
        head.next = new Node(2);
        head.next.child = new Node(10);
        head.next.next = new Node(1);
        head.next.next.child = new Node(7);
        head.next.next.child.child = new Node(11);
        head.next.next.child.child.child = new Node(12);
        head.next.next.next = new Node(4);
        head.next.next.next.child = new Node(9);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.child = new Node(6);
        head.next.next.next.next.child.child = new Node(8);
        Node newHead =Flattened(head);
        System.out.println("List");
        while(newHead !=null){
            System.out.print(newHead.data+" ");
            newHead = newHead.child;
        }
    }
}
