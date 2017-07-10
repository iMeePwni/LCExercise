import org.junit.*

/**
 * Created by guofeng on 2017/7/10.
 */
class KeyboardRowTest {
    @Test
    fun findWords() {
        val keyboardRow = KeyboardRow()
        val input = arrayOf("Hello", "Alaska", "Dad", "Peace")
        val output = keyboardRow.findWords(input)
        val expected = arrayOf("Alaska", "Dad")
        Assert.assertArrayEquals(expected, output)
    }

}