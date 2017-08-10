import org.junit.*

/**
 * Created by guofeng on 2017/8/10.
 */
class ReverseStringTest {
    @Test
    @Throws(Exception::class)
    fun solution() {
        val input = "hello"
        val output = ReverseString().solution(input)
        val expected = "olleh"
        Assert.assertEquals(expected, output)
    }

}