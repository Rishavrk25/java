import DSA QUESTIONS.Q10_mergeKsortedList.ListNode;

public class Q19_RotateLinkedList {
     public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null) return head;
        ListNode temp=head;
        int n=0;
        while(temp!=null){
            n++;
            temp=temp.next;
        }

        ListNode slow=head;
        ListNode fast=head;
        k%=n;
        if(k==0) return head;
        for(int i=0;i<k;i++){
            fast=fast.next;
        }
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        ListNode newHead=slow.next;
        slow.next=null;
        fast.next=head;
        return newHead;
    }
}
