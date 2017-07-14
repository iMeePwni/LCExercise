import org.junit.*

/**
 * Created by guofeng on 2017/7/14.
 */
class ClimbingStairsTest {
    @Test
    fun solution() {
        val input = 2
        val output = ClimbingStairs().solution(input)
        val expected = 2
        Assert.assertEquals(expected, output)
    }

}