import org.junit.*

/**
 * Created by guofeng on 2017/7/15.
 */
class MaximumSubArrayTest {
    @Test
    fun solution() {
        val input = intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4)
        val output = MaximumSubArray().solution(input)
        val expected = 6
        Assert.assertEquals(expected, output)
    }

}