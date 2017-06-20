/**
 * Created by guofeng on 2017/6/20.
 * https://leetcode.com/problems/hamming-distance/#/description
 */
class HammingDistance {

    fun solution(x: Int, y: Int): Int? {

        val max = Math.pow(2.0, 31.0).toInt()

        if (x !in 0..max - 1 || y !in 0..max - 1) return null

        val xi = getIndex(x)
        val yi = getIndex(y)

        val xyi = (xi + yi) / 2

        return Math.pow(2.0, xyi.toDouble()).toInt()
    }

    fun getIndex(x: Int): Int {
        val xb = Integer.toBinaryString(x)
        val xi: Int = xb.indexOf("1") + 1
        return xi
    }
}