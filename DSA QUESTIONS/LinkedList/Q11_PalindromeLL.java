package LinkedList;
public class Q11_PalindromeLL {
    ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        ListNode Next= head;
        while(curr!=null){
            Next = curr.next;
            curr.next=prev;
            prev=curr;
            curr=Next;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        // slow -> left middle / middle
        ListNode temp=reverse(slow.next);
        while(temp!=null && head!=null){
            if(temp.val!=head.val) return false;
            temp=temp.next;
            head=head.next;
        }
        return true;
    }
}
