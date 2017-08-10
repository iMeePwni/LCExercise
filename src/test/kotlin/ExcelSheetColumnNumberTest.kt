import org.junit.*

/**
 * Created by guofeng on 2017/8/10.
 */
class ExcelSheetColumnNumberTest {
    @Test
    @Throws(Exception::class)
    fun titleToNumber() {
        val input = "AB"
        val output = ExcelSheetColumnNumber().titleToNumber(input)
        val expected = 28
        Assert.assertEquals(expected, output)
    }

}