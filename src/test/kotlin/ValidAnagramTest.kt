import org.junit.*

/**
 * Created by guofeng on 2017/8/10.
 */
class ValidAnagramTest {
    @Test
    @Throws(Exception::class)
    fun isAnagram() {
        val s = "anagram"
        val t = "nagaram"
        val output = ValidAnagram().isAnagram(s, t)
        Assert.assertTrue(output)
    }

}