/**
 * Created by guofeng on 2017/7/12.
 */
class DiameterOfBinaryTree {

    fun single(treeNode: TreeNode?): Int {
        if (treeNode == null)
            return 0
        return Math.max(single(treeNode.left), single(treeNode.right)) + 1
    }

    fun solution(treeNode: TreeNode?): Int {
        if (treeNode == null)
            return 0
        val lr = single(treeNode.left) + single(treeNode.right)
        val ls = solution(treeNode.left)
        val rs = solution(treeNode.right)
        return Math.max(Math.max(ls, rs), lr)
    }
}