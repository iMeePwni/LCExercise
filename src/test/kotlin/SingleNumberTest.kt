import org.junit.*

/**
 * Created by guofeng on 2017/7/10.
 */
class SingleNumberTest {
    @Test
    fun solution() {
        val singleNumber = SingleNumber()
        val ints = arrayOf(1, 2, 2, 3, 1)
        val expected = 3
        val solution = singleNumber.solution(ints)
        Assert.assertEquals(expected, solution)
    }

}