import org.junit.Assert
import org.junit.Test

/**
 * Created by guofeng on 2017/6/23.
 */
class ReverseWordsInAStringIIITest {
    @Test
    fun solution() {
        val input = "Let's take LeetCode contest"

        val solution = ReverseWordsInAStringIII().solution(input)
        val expected = "s'teL ekat edoCteeL tsetnoc"

        Assert.assertEquals(expected, solution)
    }
}