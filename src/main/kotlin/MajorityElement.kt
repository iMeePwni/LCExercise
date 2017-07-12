/**
 * Created by guofeng on 2017/7/12.
 * https://leetcode.com/problems/majority-element/#/description
 */
class MajorityElement {
    fun solution(ints: IntArray): Int? {
        if (ints.isEmpty())
            return null
        val size = ints.size
        val list = MutableList(size) {
            0
        }
        ints.forEach {
            list[it % size]++
        }
        var max = 0
        (1 until size)
                .asSequence()
                .filter { list[it] > list[max] }
                .forEach { max = it }
        return max
    }

    fun betterSolution(ints: IntArray): Int? {
        if (ints.isEmpty())
            return null
        var max = ints[0]
        var count = 1
        for (i in 1 until ints.size) {
            if (count == 0) {
                max = ints[i]
                count++
            } else if (max == ints[i])
                count++
            else
                count--
        }
        return max
    }
}