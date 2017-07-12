import org.junit.*

/**
 * Created by guofeng on 2017/7/12.
 */
class MajorityElementTest {
    @Test
    fun solution() {
        val input = intArrayOf(1, 1, 1, 2, 2)
        val output = MajorityElement().solution(input)
        val expected = 1
        Assert.assertEquals(expected, output)
    }

    @Test
    fun betterSolution() {
        val input = intArrayOf(1, 1, 1, 2, 2)
        val output = MajorityElement().betterSolution(input)
        val expected = 1
        Assert.assertEquals(expected, output)
    }

}