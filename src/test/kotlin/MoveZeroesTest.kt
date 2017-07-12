import org.junit.*

/**
 * Created by guofeng on 2017/7/12.
 */
class MoveZeroesTest {
    @Test
    fun solution() {
        val input = intArrayOf(0, 1, 0, 3, 12)
        val output = MoveZeroes().solution(input)
        val expected = intArrayOf(1, 3, 12, 0, 0)
        Assert.assertArrayEquals(expected, output)
    }

}