import java.util.*;
class Node {
    int data;
    Node next;
    Node(int data,Node next){
        this.data = data;
        this.next = next;
    }
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class DSA143 {
    static Node mergeList(ArrayList<Node> lists){
        PriorityQueue<Map.Entry<Integer,Node>> pq = new PriorityQueue<>(
          Comparator.comparingInt(Map.Entry::getKey)
        );
        for(Node node : lists){
            if(node !=null){
                pq.add(new AbstractMap.SimpleEntry<>(node.data,node));
            }
        }
        Node dummy = new Node(-1);
        Node current = dummy;

        while(!pq.isEmpty()){
            Map.Entry<Integer,Node> Entry = pq.poll();
            Node node = Entry.getValue();

            if(node.next !=null){
                pq.add(new AbstractMap.SimpleEntry<>(node.next.data,node.next));
            }

            current.next = node;
            current = current.next;
        }
        return dummy.next;
    }
    static void PrintList(Node head){
        while(head!=null){
            System.out.print(head.data+" ");
            head = head.next;
        }
    }
    public static void main(String[]args){
        Node head1 = new Node(1,new Node(4,new Node(5)));
        Node head2 = new Node(1,new Node(3,new Node(4)));
        Node head3 = new Node(2,new Node(6));

        ArrayList<Node> lists = new ArrayList<>();
        lists.add(head1);
        lists.add(head2);
        lists.add(head3);

        System.out.println("Original list");
        for(int i=0;i<lists.size();i++){
            System.out.print("List"+i+1+": ");
            PrintList(lists.get(i));
            System.out.println();
        }
        Node merged = mergeList(lists);
        System.out.println("The merged list:");
        PrintList(merged);

    }
}
