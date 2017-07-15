import org.junit.Assert.assertTrue
import org.junit.Test

/**
 * Created by guofeng on 2017/7/15.
 */
class SymmetricTreeTest {
    @Test
    fun solution() {
        val input = TreeNode(1,
                TreeNode(2, TreeNode(3), TreeNode(4)),
                TreeNode(2, TreeNode(4), TreeNode(3)))
        val output = SymmetricTree().solution(input)
        assertTrue(output)
    }

}