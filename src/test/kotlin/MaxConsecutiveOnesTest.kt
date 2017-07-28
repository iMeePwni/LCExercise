import org.junit.*

/**
 * Created by guofeng on 2017/7/28.
 */
class MaxConsecutiveOnesTest {
    @Test
    @Throws(Exception::class)
    fun findMaxConsecutiveOnes() {
        val input = intArrayOf(1, 1, 0, 1, 1, 1)
        val output = MaxConsecutiveOnes().findMaxConsecutiveOnes(input)
        val expected = 3
        Assert.assertEquals(expected, output)
    }

}