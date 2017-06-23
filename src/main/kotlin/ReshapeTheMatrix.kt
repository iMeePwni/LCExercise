/**
 * Created by guofeng on 2017/6/23.
 * https://leetcode.com/problems/reshape-the-matrix/#/description
 */
class ReshapeTheMatrix {
    fun solution(numbs: Array<IntArray>, row: Int, column: Int): Array<IntArray>? {

        var length = 0
        numbs.forEach { length += it.size }

        if (row * column != length)
            return null

        val list = mutableListOf<Int>()
        numbs.forEach {
            list.addAll(it.toList())
        }
        var start = 0
        val output = Array(row, {
            val intArray = list.subList(start, start + column).toIntArray()
            start += column
            intArray
        })

        return output
    }
}
