import org.junit.*

/**
 * Created by guofeng on 2017/7/11.
 */
class InvertBinaryTreeTest {
    @Test
    fun invertTree() {
        val input = TreeNode(middle = 4,
                left =
                TreeNode(middle = 2, left = TreeNode(1), right = TreeNode(3)),
                right =
                TreeNode(middle = 7, left = TreeNode(6), right = TreeNode(9)))
        val output = InvertBinaryTree().invertTree(input)
        val expected = TreeNode(middle = 4,
                left =
                TreeNode(middle = 7, left = TreeNode(9), right = TreeNode(6)),
                right =
                TreeNode(middle = 2, left = TreeNode(3), right = TreeNode(1)))
        Assert.assertEquals(expected, output)
    }

}