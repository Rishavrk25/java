public class Q32_ReverseNodesInKgroup {
    ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode Next = head;
        while (curr != null) {
            Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next;
        }
        return prev;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode ans = head;
        for (int i = 0; i < k - 1; i++) {
            ans = ans.next;
        }
        ListNode L = head;
        ListNode R = head;
        ListNode prev = null;
        while (R != null) {
            for (int i = 0; i < k - 1; i++) {
                R = R.next;
                if (R == null)
                    return ans;
            }
            if (prev != null)
                prev.next = R;
            ListNode Rnext = null;
            Rnext = R.next;
            R.next = null;
            ListNode rev = reverse(L);
            L.next = Rnext;
            prev = L;
            L = Rnext;
            R = Rnext;
        }
        return ans;
    }
}
