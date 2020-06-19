/**
 * Reverse a singly linked list.
 *
 * Example:
 * Input: 1->2->3->4->5->NULL
 * Output: 5->4->3->2->1->NULL
 *
 * Follow up:
 * A linked list can be reversed either iteratively or recursively. Could you implement both?
 */
public class ReverseLL {
    //Iterative
    public static class Solution1 {
        public ListNode reverseList(ListNode head) {
            ListNode prev = null;
            ListNode curr = head;
            while (curr != null) {
                ListNode tempNext = curr.next;
                curr.next = prev;
                prev = curr;
                curr = tempNext;
            }
            return prev;
        }
    }

    //Recursive
    public static class Solution2 {
        public ListNode reverseList(ListNode head) {
            if (head == null || head.next == null) return head;
            ListNode p = reverseList(head.next);
            head.next.next = head;
            head.next = null;
            return p;
        }
    }
}
