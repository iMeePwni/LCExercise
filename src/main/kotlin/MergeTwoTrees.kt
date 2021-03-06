/**
 * Created by guofeng on 2017/6/19.
 * https://leetcode.com/problems/merge-two-binary-trees/#/description
 */
class MergeTwoTrees {

    fun solution(t1: TreeNode?, t2: TreeNode?): TreeNode? {
        if (t1 == null && t2 == null) return null

        return TreeNode((t1?.middle ?: 0) + (t2?.middle ?: 0),
                solution(t1?.left, t2?.left),
                solution(t1?.right, t2?.right))
    }


}

data class TreeNode(
        var middle: Int,
        var left: TreeNode? = null,
        var right: TreeNode? = null
)