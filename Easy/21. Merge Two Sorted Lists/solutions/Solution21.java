// Time: ~ O(n1 + n2)

public class Solution21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode temp = new ListNode(-1), l1Temp = l1, l2Temp = l2, current = temp;
        while (l1Temp != null && l2Temp != null) {
            if (l1Temp.val <= l2Temp.val) {
                current.next = l1Temp;
                l1Temp = l1Temp.next;
            } else {
                current.next = l2Temp;
                l2Temp = l2Temp.next;
            }
            current = current.next;
        }
        current.next = l1Temp == null ? l2Temp : l1Temp;
        return temp.next;
    }
}