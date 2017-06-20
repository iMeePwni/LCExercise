import org.junit.Assert
import org.junit.Before
import org.junit.Test

/**
 * Created by guofeng on 2017/6/20.
 */
class ArrayPairSumTest {

    lateinit var nums: IntArray

    @Before
    fun init() {
        nums = intArrayOf(1, 4, 3, 2)
    }

    @Test
    fun solution() {
        var solution = ArrayPairSum().solution(nums)

        var expected = 4

        Assert.assertEquals(expected, solution)
    }


}
