import org.junit.*

/**
 * Created by guofeng on 2017/7/24.
 */
class GenerateParenthesesTest {
    @Test
    @Throws(Exception::class)
    fun generateParenthesis() {
        val input = 3
        val output = GenerateParentheses().generateParenthesis(input)
        val expected = arrayListOf("((()))",
                "(()())",
                "(())()",
                "()(())",
                "()()()")
        Assert.assertEquals(expected.size, output.size)
        expected.forEach {
            Assert.assertTrue(output.contains(it))
        }
    }
}