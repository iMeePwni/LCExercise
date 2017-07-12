/**
 * Created by guofeng on 2017/7/12.
 */
data class ListNode(val int: Int, var next: ListNode? = null)

class ReverseLinkedList {
    fun solution(head: ListNode?): ListNode? {
        var newHead: ListNode? = null
        var temp = head
        while (temp != null) {
            val next = temp.next
            temp.next = newHead
            newHead = temp
            temp = next
        }
        return newHead
    }
}