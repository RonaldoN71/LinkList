class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class MergeSortLList {
    Node head;
    int data;
    public Node add(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
        }
        else{
            Node current = head;
            while(current.next!=null){
                current = current.next;
            }
            current.next=newNode;
        }
        return head;

    }
    public void PrintList(Node head){
        Node current = head;
        while(current!=null){
            System.out.print(current.data+" ");
            current = current.next;
        }
    }
    public Node Merge(Node list1,Node list2){
        if(list1!=null && list2!=null){
            if(list1.data<list2.data){
            list1.next = Merge(list1.next,list2);
            return list1;
        }
        else{
            list2.next = Merge(list1,list2.next);
            return list2;
        }
    }
        if(list1==null){
            return list2;
        }return list1;
    }
public static void main(String[]args){
    MergeSortLList list1 = new MergeSortLList();
    MergeSortLList list2 = new MergeSortLList();
    list1.add(3);
    list1.add(4);
    Node head1 = list1.add(5);
    
    System.out.println("the list 1:");
    list1.PrintList(head1);

    list2.add(1);
    list2.add(2);
    Node head2 = list2.add(6);
    System.out.println("\nthe list 2:");
    list2.PrintList(head2);
    MergeSortLList mergeWithSort = new MergeSortLList();
    Node mergeHead = mergeWithSort.Merge(head1,head2);
    System.out.println("\nthe Sorted merge list:");
    mergeWithSort.PrintList(mergeHead);
}
}
