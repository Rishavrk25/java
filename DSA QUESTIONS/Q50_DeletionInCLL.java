public class Q50_DeletionInCLL {

     public static Node<Integer> deleteNode(Node<Integer> head, int key) {
        //Your code goes here
        if(head==null) return null;
        if(head.data==key){
            if(head.next==head) return null;
            Node<Integer> temp=head;
            while(temp.next!=head) temp=temp.next;
            temp.next=head.next;
            return head.next;
        }
        Node<Integer> temp=head;
        while(temp.next.data!=key){
            temp=temp.next;
            if(temp==head) return head;
        }
        temp.next=temp.next.next;
        return head;
    }
}