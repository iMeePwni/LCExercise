/**
 * Created by guofeng on 2017/7/12.
 */
class DiameterOfBinaryTree {
    fun solution(root: TreeNode): Int {
        return Math.max((root.left?.sum() ?: 0) + (root.right?.sum() ?: 0), root.sum())
    }

    fun TreeNode.single(): Int {
        return Math.max(this.left?.single() ?: 0, this.right?.single() ?: 0) + 1
    }

    fun TreeNode.sum(): Int {
        val lr = (this.left?.single() ?: 0) + (this.right?.single() ?: 0)
        val ls = this.left?.sum() ?: 0
        val rs = this.right?.sum() ?: 0
        return Math.max(Math.max(ls, rs), lr)
    }
}