import DSA QUESTIONS.Q10_mergeKsortedList.ListNode;

public class Q16_swapKthNodesInLL {
     public ListNode swapNodes(ListNode head, int k) {  
        // BRUTE FORCE 
        // ArrayList<Integer> arr = new ArrayList<>();
        // ListNode temp=head;
        // while(temp!=null){
        //     arr.add(temp.val);
        //     temp=temp.next;
        // }
        // int n=arr.size();
        // int i=k-1;
        // int j=n-k;
        // int t=arr.get(i);
        // arr.set(i,arr.get(j));
        // arr.set(j,t);
        // int m=0;
        // temp=head;
        // while(temp!=null){
        //     temp.val=arr.get(m++);
        //     temp=temp.next;
        // }
        // return head;

        //OPTIMAL -> SLOW FAST POINTERS
        ListNode slow=head;
        ListNode fast=head;
        ListNode prev=null;
        for(int i=0;i<k;i++){
            prev=fast;
            fast=fast.next;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        int temp=prev.val;
        prev.val=slow.val;
        slow.val=temp;
        return head;

    }
}
