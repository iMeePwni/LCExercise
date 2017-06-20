import org.junit.Assert
import org.junit.Before
import org.junit.Test

/**
 * Created by guofeng on 2017/6/19.
 */
class MergeTwoTreesTest {

    lateinit var t1: TreeNode
    lateinit var t2: TreeNode

    @Before
    fun initTrees() {

        t1 = TreeNode(1,
                TreeNode(3, TreeNode(5)),
                TreeNode(2))

        t2 = TreeNode(2,
                TreeNode(1, null, TreeNode(4)),
                TreeNode(3, null, TreeNode(7)))
    }

    @Test
    fun mergeTwoTreesTest() {

        val mergedTree = MergeTwoTrees().solution(t1, t2)
        val expectedTree = TreeNode(3,
                TreeNode(4, TreeNode(5), TreeNode(4)),
                TreeNode(5, null, TreeNode(7)))

        Assert.assertEquals(expectedTree, mergedTree)
    }

}
