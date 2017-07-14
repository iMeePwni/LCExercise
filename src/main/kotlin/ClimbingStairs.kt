/**
 * Created by guofeng on 2017/7/14.
 */
class ClimbingStairs {
    fun solution(n: Int): Int {
        if (n == 1 || n == 2) {
            return n
        }
        var first = 1
        var second = 2
        for (i in 3..n) {
            val third = first + second
            first = second
            second = third
        }
        return second
    }

}