class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class DSA130 {
    static long multiply(Node head,Node head1){
        long mod = 1000000007;
        long num1=0; long num2 = 0;

        while(head!=null || head1!=null){
            if(head!=null){
                num1 = (num1*10 + head.data )%mod;
                head = head.next;
            }
            if(head1!=null){
                num2 = (num2*10 + head1.data)% mod;
                head1 = head1.next;
            }
        }
        return (num1*num2)%mod;
    }
    public static void main(String[]args){
        Node head = new Node(8);
        head.next = new Node(4);
        head.next.next = new Node(1);

        Node head1 = new Node(9);
        head1.next = new Node(0);

        System.out.println("The multiplication is :"+multiply(head,head1));
    }
}
