import org.junit.Assert
import org.junit.Test

/**
 * Created by guofeng on 2017/6/21.
 */
internal class NumberComplementTest {

    @Test
    fun solution() {
        val x = 5
        val numberComplement = NumberComplement()

        val expected = 2
        val solution = numberComplement.solution(x)

        Assert.assertEquals(expected, solution)
    }

    @Test
    fun otherSolution() {
        val x = 5
        val numberComplement = NumberComplement()

        val expected = 2
        val solution = numberComplement.otherSolution(x)

        Assert.assertEquals(expected, solution)
    }

}