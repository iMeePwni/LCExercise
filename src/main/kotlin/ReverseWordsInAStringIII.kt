/**
 * Created by guofeng on 2017/6/23.
 * https://leetcode.com/problems/reverse-words-in-a-string-iii/#/description
 */
class ReverseWordsInAStringIII {
    fun solution(s: String): String {
        val words = s.split(" ")
        val sb = StringBuffer()
        words.forEach({
            sb.append(StringBuffer().append(it).reverse().toString()).append(" ")
        })
        sb.deleteCharAt(sb.length - 1)
        return sb.toString()
    }
}