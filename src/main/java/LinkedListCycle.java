import java.util.*;

/**
 * Created by guofeng on 2017/7/15.
 */
public class LinkedListCycle {

    private List<ListNode> listNodes;

    public boolean hasCycle(ListNode head) {
        listNodes = new ArrayList();
        ListNode temp = head;
        while (temp != null) {
            if (listNodes.contains(temp))
                return true;
            else {
                listNodes.add(temp);
                temp = temp.getNext();
            }
        }
        return false;
    }

    public boolean anotherHasCycle(ListNode head) {
        if (head == null || head.getNext() == null)
            return false;
        ListNode slow = head;
        ListNode fast = head.getNext();
        while (slow != fast) {
            if (fast == null || fast.getNext() == null) {
                return false;
            }
            slow = slow.getNext();
            fast = fast.getNext().getNext();
        }
        return true;
    }
}
