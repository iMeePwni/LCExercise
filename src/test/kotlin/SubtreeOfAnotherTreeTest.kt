import org.junit.*

/**
 * Created by guofeng on 2017/7/14.
 */
class SubtreeOfAnotherTreeTest {
    @Test
    fun isSubtree() {
        subtree(0)
    }

    @Test
    fun anotherSolution() {
        subtree(1)
    }

    private fun subtree(int: Int) {
        val s = TreeNode(3,
                TreeNode(4, TreeNode(1), TreeNode(2)),
                TreeNode(5))
        val t = TreeNode(4,
                TreeNode(1),
                TreeNode(2))
        val output = if (int == 0)
            SubtreeOfAnotherTree().isSubtree(s, t)
        else
            SubtreeOfAnotherTree().anotherSolution(s, t)
        Assert.assertTrue(output)
    }
}