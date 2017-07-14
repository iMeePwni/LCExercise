/**
 * Created by guofeng on 2017/7/14.
 */
class SubtreeOfAnotherTree {
    fun isSubtree(s: TreeNode?, t: TreeNode?): Boolean {
        if (s == null || t == null)
            return false
        return s.toString().contains(t.toString())
    }

    fun anotherSolution(s: TreeNode?, t: TreeNode?): Boolean {
        if (s == null)
            return false
        if (isSame(s, t))
            return true
        return anotherSolution(s.left, t) || anotherSolution(s.right, t)
    }

    private fun isSame(s: TreeNode?, t: TreeNode?): Boolean {
        if (s == null && t == null) return true
        if (s == null || t == null) return false
        if (s.middle != t.middle) return false
        return isSame(s.left, t.left) && isSame(s.right, t.right)
    }

}