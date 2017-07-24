import org.junit.*

/**
 * Created by guofeng on 2017/7/24.
 */
class FriendCirclesTest {
    @Test
    @Throws(Exception::class)
    fun findCircleNum() {
        val input = arrayOf(intArrayOf(1, 1, 0),
                intArrayOf(1, 1, 0),
                intArrayOf(0, 0, 1))
        val output = FriendCircles().findCircleNum(input)
        val expected = 2
        Assert.assertEquals(expected, output)
    }

}