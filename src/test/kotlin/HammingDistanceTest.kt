import org.junit.Assert
import org.junit.Test

/*
* Created by guofeng on 2017/6/20.
*/
class HammingDistanceTest {

    @Test
    fun hammingDistanceTest() {
        val x = 1
        val y = 4

        val solution = HammingDistance().solution(x, y)
        val expected = 2

        Assert.assertEquals(expected, solution)
    }

    @Test
    fun hammingDistanceXTest() {
        val x = -1
        val y = 4

        val solution = HammingDistance().solution(x, y)
        val expected = null

        Assert.assertEquals(expected, solution)
    }

    @Test
    fun hammingDistanceYTest() {
        val x = 1
        val y = Math.pow(2.0, 31.0).toInt()

        val solution = HammingDistance().solution(x, y)
        val expected = null

        Assert.assertEquals(expected, solution)
    }
}
