import org.junit.Assert
import org.junit.Before
import org.junit.Test

/**
 * Created by guofeng on 2017/6/20.
 */
class ArrayPairSumTest {

    lateinit var numbs: IntArray

    @Before
    fun init() {
        numbs = intArrayOf(1, 4, 3, 2)
    }

    @Test
    fun solution() {
        val solution = ArrayPairSum().solution(numbs)

        val expected = 4

        Assert.assertEquals(expected, solution)
    }


}
