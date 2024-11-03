class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class ListDelete {
    Node head;
    Node add(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
        }
        else{
            Node current = head;
            while(current.next!=null){
                current=current.next;
            } current.next = newNode;
        }
        return head;
    }
    void display(Node Head){
        Node current = Head;
       while(current!=null){
        System.out.print(current.data+" ");
        current = current.next;
       }
       System.out.println();
    }
    void deletePosition(int data){
     Node current = head;
     if(head==null){
        System.out.println("Error");
        return;
     }
     if(head.next==null){
        head=null;
     }
     for(int i=0;i<data-1;i++){
        if(current.next==null){
            System.out.println("Error");
            return;
        }
        current = current.next;
     }
     if(current.next==null){
        System.out.println("Error");
        return;
     }
     current.next = current.next.next;
    }
    public static void main(String[]args){
    ListDelete list = new ListDelete();
    list.add(1);
    list.add(2);
    list.add(3);
    Node head = list.add(4);
    System.out.println("The list before deletion:");
    list.display(head);
    list.deletePosition(2);
    System.out.println("The list after deletion:");
    list.display(head);
    }
}
