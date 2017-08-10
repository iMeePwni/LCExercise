import org.junit.*

/**
 * Created by guofeng on 2017/8/10.
 */
class FizzBuzzTest {
    @Test
    @Throws(Exception::class)
    fun solution() {
        val input = 15
        val output = FizzBuzz().solution(input)
        val expected = listOf(
                "1",
                "2",
                "Fizz",
                "4",
                "Buzz",
                "Fizz",
                "7",
                "8",
                "Fizz",
                "Buzz",
                "11",
                "Fizz",
                "13",
                "14",
                "FizzBuzz")
        Assert.assertEquals(expected, output)
    }

}