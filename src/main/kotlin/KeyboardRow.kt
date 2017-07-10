/**
 * Created by guofeng on 2017/7/10.
 */
class KeyboardRow {

    fun findWords(words: Array<String>): Array<String> {

        val str1 = "qwertyuiop"
        val str2 = "asdfghjkl"
        val str3 = "zxcvbnm"

        val toTypedArray = words.filter {
            val toLowerCase = it.toLowerCase()
            toLowerCase.all {
                it in str1
            } || toLowerCase.all {
                it in str2
            } || toLowerCase.all {
                it in str3
            }
        }.toTypedArray()

        return toTypedArray
    }
}