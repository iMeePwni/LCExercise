import org.junit.*

/**
 * Created by guofeng on 2017/7/28.
 */
class PermutationsTest {
    @Test
    @Throws(Exception::class)
    fun permute() {
        val input = intArrayOf(1, 2, 3)
        val output = Permutations().permute(input)
        val expected = arrayListOf(
                arrayListOf(1, 2, 3),
                arrayListOf(1, 3, 2),
                arrayListOf(2, 1, 3),
                arrayListOf(2, 3, 1),
                arrayListOf(3, 1, 2),
                arrayListOf(3, 2, 1))
        expected.forEach {
            Assert.assertTrue(output.contains(it))
        }
    }

}