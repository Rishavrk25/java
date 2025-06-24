public class Q27_ReverseLL2 {
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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode L = head;
        ListNode R = head;
        ListNode prev=null;
        int i=1;
        while(i<right){
            if(i<left){
                prev=L;
                L=L.next;
            }
            R=R.next;
            i++;
        }
        ListNode Rnext=R.next;
        R.next=null;
        ListNode temp=reverse(L);
        if(prev!=null) prev.next=temp;
        L.next=Rnext;
        if(L==head) return temp;
        return head;
    }
}
