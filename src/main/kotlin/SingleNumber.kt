/**
 * Created by guofeng on 2017/7/10.
 */
class SingleNumber {
    fun solution(ints: Array<Int>): Int {
        var output = 0
        ints.forEach {
            output = output.xor(it)
        }
        return output
    }
}