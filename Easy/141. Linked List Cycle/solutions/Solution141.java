public class Solution141 {
    public boolean hasCycle(ListNode head) {
        if (isNull(head)) return false;

        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            if (isNull(fast)) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }

    private boolean isNull(ListNode node) {
        return (node == null || node.next == null);
    }
}