import org.junit.*

/**
 * Created by guofeng on 2017/8/10.
 */
class FirstUniqueCharacterInAStringTest {
    @Test
    @Throws(Exception::class)
    fun firstUniqueChar() {
        val input = "leetcode"
        val output = FirstUniqueCharacterInAString().firstUniqueChar(input)
        val expected = 0
        Assert.assertEquals(expected, output)
    }

}