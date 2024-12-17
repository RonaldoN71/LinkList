class Node{
 int data ;
 Node next;
 Node(int data){
    this.data = data;
    this.next = null;
 }
}
public class DSA134 {
    static Node FindMergeNode(Node head,Node head1){
        Node curr1 = head;
        Node curr2 = head1;
        while(curr1!=null){
            curr2 = head1;
            while(curr2!=null){
                if(curr1==curr2){
                    return curr2;
                }
                curr2 = curr2.next;
            }
            curr1 = curr1.next;
        }
        return null;
    }

    public static void main(String[]args){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        Node head1 = new Node(8);
        head1.next = head.next;

        Node mergeNode = FindMergeNode(head,head1);
        if (mergeNode != null) {
            System.out.println("The data of the first merged Node: " + mergeNode.data);
        } else {
            System.out.println("No merge point found.");
        }

    }
}
