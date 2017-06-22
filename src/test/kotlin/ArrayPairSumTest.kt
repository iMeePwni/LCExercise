import org.junit.Assert
import org.junit.Test

/**
 * Created by guofeng on 2017/6/20.
 */
class ArrayPairSumTest {

    @Test
    fun solution() {
        val numbs = intArrayOf(1, 4, 3, 2)

        val solution = ArrayPairSum().solution(numbs)
        val expected = 4

        Assert.assertEquals(expected, solution)
    }

}
