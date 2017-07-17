/**
 * Created by guofeng on 2017/7/17.
 */
public class IntersectionOfTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;

        ListNode a = headA;
        ListNode b = headB;

        while (a != b) {
            a = a == null ? headB : a.getNext();
            b = b == null ? headA : b.getNext();
        }

        return a;
    }
}
