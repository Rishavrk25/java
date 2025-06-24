public class Q31_SplitLinkedList {
    public ListNode[] splitListToParts(ListNode head, int k) {
        int n = 0;
        ListNode temp = head;
        while (temp != null) {
            n++;
            temp = temp.next;
        }

        ListNode[] ans = new ListNode[k];
        int extra = k < n ? n % k : 0;
        temp = head;
        for (int i = 0; i < k; i++) {
            ListNode dummy = new ListNode(-1);
            ListNode d = dummy;
            int listSize = n > k ? n / k : 1;
            if (extra != 0) {
                listSize++;
                extra--;
            }
            while (listSize != 0) {
                d.next = temp;
                d = d.next;
                if (temp != null) temp = temp.next;
                listSize--;
            }
            if (d != null) d.next = null;
            ans[i] = dummy.next;
        }
        return ans;
    }
}
