/**
 * Created by guofeng on 2017/6/19.
 */
class MergeTwoTrees {

    fun mergeTrees(t1: TreeNode?, t2: TreeNode?): TreeNode? {
        if (t1 == null && t2 == null) return null

        return TreeNode((t1?.middle ?: 0) + (t2?.middle ?: 0),
                mergeTrees(t1?.left ?: null, t2?.left ?: null),
                mergeTrees(t1?.right ?: null, t2?.right ?: null))
    }


}

data class TreeNode(
        var middle: Int,
        var left: TreeNode? = null,
        var right: TreeNode? = null
)