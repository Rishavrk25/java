package LinkedList;
public class Q14_ReorderLL {
    ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        ListNode Next=head;
        while(curr!=null){
            Next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=Next;
        }
        return prev;
    }
    public void reorderList(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        // slow -> left middle / middle
        ListNode dummy = new ListNode(0);
        ListNode t1=head;
        ListNode t2=reverse(slow.next);
        slow.next=null;
        ListNode temp=dummy;
        while(t1!=null && t2!=null){
            temp.next=t1;
            temp=t1;
            t1=t1.next;

            temp.next=t2;
            temp=t2;
            t2=t2.next;
        }
        if(t1==null) temp.next=t2;
        else if(t2==null) temp.next=t1;
        head=dummy.next;
    }
}
