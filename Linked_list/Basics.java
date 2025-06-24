class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
}
public class Basics {

    // Displaying LL
    public static void print(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.val);
            temp=temp.next;
        }
    }

    // Displaying LL using recursion
    public static void printr(Node head){
        if(head==null) return;
        System.out.println(head.val);
        printr(head.next);
    }
    public static void main(String[] args) {
        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(40);
        Node e=new Node(50);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        printr(a);
        
    }
}
