package LinkedList;
import DSA QUESTIONS.Q10_mergeKsortedList.ListNode;

public class Q23_SortLinkedList {
    ListNode merge(ListNode list1, ListNode list2){
        ListNode dummy = new ListNode(1);
        ListNode temp=dummy;
        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                temp.next=list1;
                list1=list1.next;
            }
            else{
                temp.next=list2;
                list2=list2.next;
            }
            temp=temp.next;
        }
        if(list1==null){
            temp.next=list2;
        }
        else{
            temp.next=list1;
        }
        return dummy.next;
    }
    public ListNode sortList(ListNode head) {
        // Using Merge Sort
        if(head==null || head.next==null) return head;
        ListNode firstHalf = head;
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode secondHalf=slow.next;
        slow.next=null;
         firstHalf=sortList(firstHalf);
         secondHalf=sortList(secondHalf);
        return merge(firstHalf,secondHalf);
    }
}
