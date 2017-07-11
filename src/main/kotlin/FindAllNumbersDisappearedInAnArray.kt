/**
 * Created by guofeng on 2017/7/11.
 */
class FindAllNumbersDisappearedInAnArray {
    fun findDisappearedNumbers(ints: IntArray): List<Int> {
        val temp = arrayOfNulls<Int>(ints.size)
        ints.forEach {
            temp[it - 1] = it
        }
        val list = (1..temp.size).filter { temp[it - 1] == null }
        return list
    }
}