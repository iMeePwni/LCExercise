import org.junit.Assert
import org.junit.Test

/**
 * Created by guofeng on 2017/6/23.
 */
class ReshapeTheMatrixTest {

    @Test
    fun solution() {
        val numbs = arrayOf(intArrayOf(1, 2), intArrayOf(3, 4))
        val row = 1
        val column = 4
        val reshapeTheMatrix = ReshapeTheMatrix()

        val solution = reshapeTheMatrix.solution(numbs, row, column)
        val expected = arrayOf(intArrayOf(1, 2, 3, 4))

        Assert.assertArrayEquals(expected, solution)
    }

    @Test
    fun solutionIllegal() {
        val numbs = arrayOf(intArrayOf(1, 2), intArrayOf(3, 4))
        val row = 2
        val column = 4
        val reshapeTheMatrix = ReshapeTheMatrix()

        val solution = reshapeTheMatrix.solution(numbs, row, column)

        Assert.assertNull(solution)
    }
}