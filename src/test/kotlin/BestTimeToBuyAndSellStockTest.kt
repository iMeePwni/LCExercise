import org.junit.*

/**
 * Created by guofeng on 2017/7/14.
 */
class BestTimeToBuyAndSellStockTest {
    @Test
    fun maxProfit() {
        val input = intArrayOf(7, 1, 5, 3, 6, 4)
        val output = BestTimeToBuyAndSellStock().maxProfit(input)
        val expected = 5
        Assert.assertEquals(expected, output)
    }

}