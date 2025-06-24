import java.lang.classfile.components.ClassPrinter.ListNode;
import java.util.PriorityQueue;

public class Q10_mergeKsortedList {
  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
  public ListNode mergeKLists(ListNode[] lists) {

    // 1.Using min Heap
    // TC = O(nlogn)
    // SC = O(n)

    // int k=lists[0].length;
    // PriorityQueue<Integer> pq = new PriorityQueue<>();
    // for (int i = 0; i < lists.length; i++) {
    // ListNode curr = lists[i];
    // while (curr != null) {
    // pq.add(curr.val);
    // curr = curr.next;
    // }
    // }
    // ListNode res = new ListNode(0);
    // ListNode temp = res;
    // while (pq.size() != 0) {
    // temp.next = new ListNode(pq.remove());
    // temp = temp.next;
    // }
    // return res.next;


    // 2. Using min Heap (Optimized)
    //    TC = O(nlogk)
    //    SC = O()

    PriorityQueue<ListNode> pq = new PriorityQueue<>(
        (a, b) -> a.val - b.val); // Build min Heap on the basis of node -> value
    int k = lists.length;
    for (int i = 0; i < k; i++) {
      ListNode node = lists[i];
      if (node != null)
        pq.add(node);
    }
    ListNode dummy = new ListNode(0);
    ListNode temp = dummy;
    while (pq.size() != 0) {
      ListNode minNode = pq.remove();
      temp.next = minNode;
      temp = temp.next;
      if (minNode.next != null)
        pq.add(minNode.next);
    }
    return dummy.next;

  }
}
