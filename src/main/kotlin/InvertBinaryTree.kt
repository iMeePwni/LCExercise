/**
 * Created by guofeng on 2017/7/11.
 */
class InvertBinaryTree {
    fun invertTree(root: TreeNode?): TreeNode? {
        if (root == null) return null
        val temp = root.left
        root.left = invertTree(root.right)
        root.right = invertTree(temp)
        return root
    }
}