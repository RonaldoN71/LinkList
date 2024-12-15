class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class DSA133_1 {
    static void removeLoop(Node head){
        if(head==null){
            return;
        }
        Node slow = head;
        Node fast = head;
      
       boolean isCycle= false;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast==slow){
                isCycle=true;
                break;
            }
        }
        
       if(isCycle){
            slow = head;
            if(slow!=fast){
                while(slow.next!=fast.next){
                    slow = slow.next;
                    fast = fast.next;
                }
                fast.next = null;
            }
            else{
                while(fast.next!=slow){
                    fast = fast.next;
                }
                fast.next = null;
            }
       }
        display(head);
}
    
    static void display(Node head){
        Node current = head;
        while(current !=null){
         System.out.print(current.data+ " ");
         current= current.next;
        }
    }
    public static void main(String[]args){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = head.next.next;
        removeLoop(head);
}
}
