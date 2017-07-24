import org.junit.*

/**
 * Created by guofeng on 2017/7/24.
 */
class ProductOfArrayExceptSelfTest {
    @Test
    @Throws(Exception::class)
    fun productExceptSelf() {
        val input = intArrayOf(1, 2, 3, 4)
        val output = ProductOfArrayExceptSelf().productExceptSelf(input)
        val expected = intArrayOf(24, 12, 8, 6)
        Assert.assertArrayEquals(expected, output)
    }

}