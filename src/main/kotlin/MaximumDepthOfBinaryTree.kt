/**
 * Created by guofeng on 2017/7/11.
 */
class MaximumDepthOfBinaryTree {
    fun maxDepth(root: TreeNode?): Int {
        if (root == null)
            return 0
        else
            return 1 + Math.max(maxDepth(root.left), maxDepth(root.right))

    }
}