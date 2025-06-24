public class Q17_LinkedListCycle2 {
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null) return null;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast) break;
        }
        if(slow==fast){
            ListNode temp=head;
            while(slow!=temp){
                temp=temp.next;
                slow=slow.next;
            }
            return temp;
        }
        return null;
    }
}
