import org.junit.*

/**
 * Created by guofeng on 2017/7/11.
 */
class MaximumDepthOfBinaryTreeTest {
    @Test
    fun maxDepth() {
        val input = TreeNode(middle = 0, left = TreeNode(middle = 1, left = TreeNode(middle = 3)))
        val expected = 3
        val output = MaximumDepthOfBinaryTree().maxDepth(input)
        Assert.assertEquals(expected, output)
    }

}