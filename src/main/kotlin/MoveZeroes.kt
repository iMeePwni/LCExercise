/**
 * Created by guofeng on 2017/7/12.
 */
class MoveZeroes {
    fun solution(ints: IntArray): IntArray {
        if (ints.isEmpty()) {
            println("ints is empty")
        } else {
            var insertPos = 0
            ints.forEach {
                if (it != 0) ints[insertPos++] = it
            }
            while (insertPos < ints.size) {
                ints[insertPos++] = 0
            }
        }
        return ints
    }
}