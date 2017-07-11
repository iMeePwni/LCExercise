import org.junit.*

/**
 * Created by guofeng on 2017/7/11.
 */
class FindAllNumbersDisappearedInAnArrayTest {
    @Test
    fun findDisappearedNumbers() {
        val input = intArrayOf(4, 3, 2, 7, 8, 2, 3, 1)
        val output = FindAllNumbersDisappearedInAnArray().findDisappearedNumbers(input)
        val expected = arrayListOf(5, 6)
        Assert.assertArrayEquals(expected.toIntArray(), output.toIntArray())
    }

}