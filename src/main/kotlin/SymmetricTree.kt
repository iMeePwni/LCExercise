/**
 * Created by guofeng on 2017/7/15.
 */
class SymmetricTree {
    fun solution(root: TreeNode): Boolean {
        return isSymmetric(root.left, root.right)
    }

    fun isSymmetric(left: TreeNode?, right: TreeNode?): Boolean {
        if (left == null && right == null) return true
        if (left == null || right == null) return false
        return isSymmetric(left.left, right.right)
                && isSymmetric(left.right, right.left)
                && left.middle == right.middle
    }
}