/**
 * Created by guofeng on 2017/6/20.
 * https://leetcode.com/problems/array-partition-i/#/description
 */
class ArrayPairSum {
    fun solution(numbs: IntArray): Int? {

        val size = numbs.size
        val n = size / 2
        if (size !in 1..10000 || size % 2 != 0) return null

        numbs.sort()

        val numbs1 = mutableListOf<Int>()
        val numbs2 = mutableListOf<Int>()

        for (i in 0..size - 1 step 2) {
            numbs1.add(numbs[i])
            numbs2.add(numbs[i + 1])
        }

        val pairSum: Int = (0..n - 1).sumBy { Math.min(numbs1[it], numbs2[it]) }

        return pairSum
    }

}