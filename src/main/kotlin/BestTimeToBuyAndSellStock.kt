/**
 * Created by guofeng on 2017/7/14.
 */
class BestTimeToBuyAndSellStock {
    fun maxProfit(ints: IntArray): Int {
        var minPrice = ints[0]
        var maxProfit = 0
        ints.forEach {
            if (it < minPrice)
                minPrice = it
            (it - minPrice).let {
                if (it > maxProfit)
                    maxProfit = it
            }
        }
        return maxProfit
    }
}