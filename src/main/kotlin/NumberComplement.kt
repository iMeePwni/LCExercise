/**
 * Created by guofeng on 2017/6/21.
 * https://leetcode.com/problems/number-complement/#/description
 */
class NumberComplement {

    fun solution(x: Int): Int? {

        if (x !in 1..Int.MAX_VALUE) return null

        val binaryString = Integer.toBinaryString(x)
        val result = (0..binaryString.length - 1)
                .filter { binaryString[it].equals('0') }
                .sumBy { Math.pow(2.0, it.toDouble()).toInt() }
        return result
    }

    fun otherSolution(x: Int): Int? {
        var sum = 0
        var i = 0

        while (sum < x) {
            sum += Math.pow(2.0, i++.toDouble()).toInt()
        }

        return sum - x
    }
}