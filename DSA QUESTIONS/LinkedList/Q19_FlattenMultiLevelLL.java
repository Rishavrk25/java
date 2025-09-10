package LinkedList;
public class Q19_FlattenMultiLevelLL {
     public Node flatten(Node head) {
        Node temp=head;
        while(temp!=null){
            Node n=temp.next;
            if(temp.child!=null){
                Node c=temp.child;
                c=flatten(c);
                Node d=c;
                while(d.next!=null) d=d.next;
                temp.next=c;
                c.prev=temp;
                d.next=n;
                if(n!=null) n.prev=d;
                temp.child=null;
            }
            temp=n;
        }
        return head;
    }
}
