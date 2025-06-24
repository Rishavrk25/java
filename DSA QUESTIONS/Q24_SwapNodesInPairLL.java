public class Q24_SwapNodesInPairLL {
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode newHead=head.next;
        ListNode curr=head;
        ListNode prev=null;
        while(curr!=null && curr.next!=null){
            ListNode nextPair=curr.next.next;
            ListNode Next=curr.next;
            Next.next=curr;
            curr.next=nextPair;
            if(prev!=null) prev.next=Next;
            prev=curr;
            curr=nextPair;
        }
        return newHead;
    }
}
