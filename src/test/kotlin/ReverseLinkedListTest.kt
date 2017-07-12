import org.junit.*

/**
 * Created by guofeng on 2017/7/12.
 */
class ReverseLinkedListTest {
    @Test
    fun solution() {
        val input = ListNode(1, ListNode(2, ListNode(3)))
        val output = ReverseLinkedList().solution(input)
        val expected = ListNode(3, ListNode(2, ListNode(1)))
        Assert.assertEquals(expected, output)
    }

}