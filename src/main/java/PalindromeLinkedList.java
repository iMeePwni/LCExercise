/**
 * Created by guofeng on 2017/7/17.
 */
public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head, slow = head;
        while (fast != null && fast.getNext() != null) {
            fast = fast.getNext().getNext();
            slow = slow.getNext();
        }
        if (fast != null) { // let right half smaller
            slow = slow.getNext();
        }
        slow = reverse(slow);
        fast = head;

        while (slow != null) {
            if (fast.getInt() != slow.getInt())
                return false;
            fast = fast.getNext();
            slow = slow.getNext();
        }
        return true;
    }

    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode next;
        while (head != null) {
            next = head.getNext();
            head.setNext(prev);
            prev = head;
            head = next;
        }
        return prev;
    }

}
