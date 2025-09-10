package LinkedList;
import java.util.PriorityQueue;

import DSA QUESTIONS.Q10_mergeKsortedList.ListNode;

public class Q24_MergeKsortedLinkedList {
    // OPTIMAL -> USING PRIORITY QUEUE -> TC = O(nLogk)
 class Pair implements Comparable<Pair>{
    int ele;
    ListNode node;
    Pair(int ele, ListNode node){
        this.ele=ele;
        this.node=node;
    }
    public int compareTo(Pair p){
        return this.ele-p.ele;
    }
 }
class Solution {
     public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for(int i=0;i<lists.length;i++){
            if(lists[i]==null) continue;
            pq.add(new Pair(lists[i].val,lists[i]));
        }
        ListNode dummy = new ListNode(0);
        ListNode temp=dummy;
        while(pq.size()!=0){
            Pair p = pq.remove();
            if(p.node.next!=null) pq.add(new Pair(p.node.next.val,p.node.next));
            temp.next=p.node;
            temp=temp.next;
        }
        return dummy.next;
     }
    }


    // Using Merge -> TC = O(N*k)
    // ListNode merge(ListNode list1, ListNode list2) {
    //     ListNode dummy = new ListNode(1);
    //     ListNode temp = dummy;
    //     while (list1 != null && list2 != null) {
    //         if (list1.val <= list2.val) {
    //             temp.next = list1;
    //             list1 = list1.next;
    //         } else {
    //             temp.next = list2;
    //             list2 = list2.next;
    //         }
    //         temp = temp.next;
    //     }
    //     if (list1 == null) {
    //         temp.next = list2;
    //     } else {
    //         temp.next = list1;
    //     }
    //     return dummy.next;
    // }

    // public ListNode mergeKLists(ListNode[] lists) {
    //     ListNode ans=null;
    //     for (int i = 0; i < lists.length; i++) {
    //          ans = merge(ans,lists[i]);  
    //     }
    //     return ans;
    // }
}
