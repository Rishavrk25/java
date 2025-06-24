public class Q30_AddTwoNumbersLL {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry=0;
        ListNode dummy = new ListNode(-1);
        ListNode temp=dummy;
        while(l1!=null || l2!=null || carry!=0){
            int d1=0,d2=0,sum=0;
            if(l1!=null) d1=l1.val;
            if(l2!=null) d2=l2.val;
            sum=d1+d2+carry;
            int val=sum%10;
            ListNode newNode = new ListNode(val);
            temp.next=newNode;
            temp=newNode;
            carry=sum/10;
            if(l1!=null) l1=l1.next;
            if(l2!=null) l2=l2.next;
        }
        temp.next=null;
        return dummy.next;
    }
}
