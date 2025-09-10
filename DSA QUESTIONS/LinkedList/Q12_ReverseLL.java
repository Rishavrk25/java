package LinkedList;
public class Q12_ReverseLL {
    public ListNode reverseList(ListNode head) {
        // Iterative method
        // if(head==null || head.next==null) return head;
        // ListNode prev=null;
        // ListNode curr=head;
        // ListNode Next=head;
        // while(curr!=null){
        //     Next=curr.next;
        //     curr.next=prev;
        //     prev=curr;
        //     curr=Next;
        // }
        // return prev;

        // Recursive method
        if(head==null || head.next==null) return head;
        ListNode a=head.next;
        ListNode newHead=reverseList(a);
        a.next=head;
        head.next=null;
        return newHead;
    }
}
