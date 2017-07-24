import org.junit.*

/**
 * Created by guofeng on 2017/7/24.
 */
class ArrayNestingTest {
    @Test
    @Throws(Exception::class)
    fun arrayNesting() {
        val input = intArrayOf(5, 4, 0, 3, 1, 6, 2)
        val output = ArrayNesting().arrayNesting(input)
        val expected = 4
        Assert.assertEquals(expected, output)
    }

}