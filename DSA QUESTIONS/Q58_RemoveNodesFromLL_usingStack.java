import java.util.Stack;

public class Q58_RemoveNodesFromLL_usingStack {
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
    public ListNode removeNodes(ListNode head) {
        head=reverse(head);
        ListNode temp=head;
        Stack<ListNode> st=new Stack<>();
        while(temp!=null){
            if(st.isEmpty()) st.add(temp);
            else{
                if(temp.val >= st.peek().val) st.add(temp);
            }
            temp=temp.next;
        }
         ListNode dummy=new ListNode(-1);
        ListNode d=dummy;
        while(!st.isEmpty()){
            d.next=st.pop();
            d=d.next;
        }
        d.next=null;
        return dummy.next;

    }
}
