import org.junit.*

/**
 * Created by guofeng on 2017/7/28.
 */
class TargetSumTest {
    @Test
    fun findTargetSumWaysTest(): Unit {
        val input = intArrayOf(1, 1, 1, 1, 1)
        val target = 3
        val output = TargetSum().findTargetSumWays(input, target)
        val expected = 5
        Assert.assertEquals(expected, output)
    }
}