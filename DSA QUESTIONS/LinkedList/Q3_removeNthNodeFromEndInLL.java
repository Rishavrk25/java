package LinkedList;
public class Q3_removeNthNodeFromEndInLL{
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // OPTIMAL -> SLOW FAST POINTER
        ListNode slow=head;
        ListNode fast=head;
        for(int i=0;i<n;i++){
            fast=fast.next;
        }
        if(fast==null){
            return head.next;
        }
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return head;

        // BRUTE FORCE -> CALCULATING SIZE ,THEN MOVING TEMP, THEN DELETING
        // if(head==null || head.next==null) return null;
        // int size=0;
        // ListNode temp=head;
        // while(temp!=null){
        //     size++;
        //     temp=temp.next;
        // }
        // if(size==n){
        //     head=head.next;
        //     return head;
        // }
        // temp=head;
        // for(int i=0;i<size-n-1;i++){
        //     temp=temp.next;
        // }
        // temp.next=temp.next.next;
        // return head;
    }
}