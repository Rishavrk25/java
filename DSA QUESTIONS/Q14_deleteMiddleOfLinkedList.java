public class Q14_deleteMiddleofLinkedList {
    public ListNode deleteMiddle(ListNode head) {

        // BRUTE FORCE -> TWO PASS
        // //Finding middle
        // ListNode i=head;
        // ListNode j=head;
        // while(j!=null && j.next!=null){
        //     i=i.next;
        //     j=j.next.next;
        // }
        // // deleting middle
        // if(head.next==null) return null;
        // ListNode temp=head;
        // while(temp.next!=i){
        //     temp=temp.next;
        // }
        // temp.next=temp.next.next;
        // return head;

        // OPTIMAL -> ONE PASS , USING PREV, slow fast pointer
        if(head==null || head.next==null) return null;
        ListNode i=head;
        ListNode j=head;
        ListNode prev=null;
        while(j!=null && j.next!=null){
            prev=i;
            i=i.next;
            j=j.next.next;
        }
        prev.next=prev.next.next;
        return head;
    }
}
