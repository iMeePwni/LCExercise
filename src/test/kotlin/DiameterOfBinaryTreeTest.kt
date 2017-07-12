import org.junit.*

/**
 * Created by guofeng on 2017/7/12.
 */
class DiameterOfBinaryTreeTest {
    @Test
    fun solution() {
        val input = TreeNode(1,
                TreeNode(2, TreeNode(4, TreeNode(4)),
                        TreeNode(5, TreeNode(5))))
        val output = DiameterOfBinaryTree().solution(input)
        val expected = 4
        Assert.assertEquals(expected, output)
    }

}