package LinkedList;
public class Q18_CopyLLwithRandomPointer {
     public Node copyRandomList(Node head) {
        if(head==null) return head;
        // Step-1 -> Deep copy
        Node newHead=new Node(head.val);
        Node t1=head.next;
        Node t2=newHead;
        while(t1!=null){
            t2.next = new Node(t1.val);
            t1=t1.next;
            t2=t2.next;
        }

        // Step-2 -> Join LL
        Node dummy=new Node(-1);
        Node d=dummy;
        t1=head;
        t2=newHead;
        while(t1!=null && t2!=null){
            d.next=t1;
            d=t1;
            t1=t1.next;
            d.next=t2;
            d=t2;
            t2=t2.next;
        }

        // Step-3 -> assign random
        t1=head;
        t2=newHead;
        while(t1!=null){
            if(t1.random!=null) t2.random=t1.random.next;
            t1=t1.next.next;
            if(t1!=null) t2=t1.next;
        }

        // Step-4 -> disconnect
        t1=head;
        t2=newHead;
        while(t1!=null){
            t1.next=t2.next;
            t1=t1.next;
            if(t2!=null && t1!=null) t2.next=t1.next;
            t2=t2.next;
        }

        return newHead;
    }
}
