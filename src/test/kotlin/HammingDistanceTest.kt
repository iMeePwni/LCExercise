import org.junit.Assert
import org.junit.Test

/**
 * Created by guofeng on 2017/6/20.
 */
class HammingDistanceTest {

    @Test
    fun hammingDistanceTest() {
        var x = 1
        var y = 4

        var solotion = HammingDistance().solution(x, y)
        var expected = 2

        Assert.assertEquals(expected, solotion)
    }

    @Test
    fun hammingDistanceXTest() {
        var x = -1
        var y = 4

        var solotion = HammingDistance().solution(x, y)
        var expected = null

        Assert.assertEquals(expected, solotion)
    }

    @Test
    fun hammingDistanceYTest() {
        var x = 1
        var y = Math.pow(2.0, 31.0).toInt()

        var solotion = HammingDistance().solution(x, y)
        var expected = null

        Assert.assertEquals(expected, solotion)
    }
}
