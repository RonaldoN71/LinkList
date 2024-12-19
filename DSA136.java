class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
class DSA136{
    static void zigzag(Node head){
        if(head==null || head.next ==null){
            return;
        }
        Node current = head;
        boolean flag = true;
        while(current.next!=null){
            if(flag){
                if(current.data>current.next.data){
                    int temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                }
                flag = false;
            }
            else{
                if(current.data<current.next.data){
                    int temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                }
                flag = true;
            }
            current = current.next;
        }
        displayList(head);
    }
    static void displayList(Node head){
        Node curr = head;
        System.out.println("The zigzag list: ");
        while(curr !=null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(11);
        head.next = new Node(15);
        head.next.next = new Node(20);
        head.next.next.next = new Node(5);
        head.next.next.next.next = new Node(10);
        zigzag(head);
    }
}