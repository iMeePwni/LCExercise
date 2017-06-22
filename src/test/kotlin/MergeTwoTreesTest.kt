import org.junit.Assert
import org.junit.Test

/*
* Created by guofeng on 2017/6/19.
*/
class MergeTwoTreesTest {

    @Test
    fun mergeTwoTreesTest() {

        val t1 = TreeNode(middle = 1,
                left = TreeNode(middle = 3, left = TreeNode(5)),
                right = TreeNode(2))

        val t2 = TreeNode(2,
                TreeNode(middle = 1, right = TreeNode(4)),
                TreeNode(middle = 3, right = TreeNode(7)))

        val mergedTree = MergeTwoTrees().solution(t1, t2)
        val expectedTree = TreeNode(middle = 3,
                left = TreeNode(middle = 4, left = TreeNode(5), right = TreeNode(4)),
                right = TreeNode(middle = 5, right = TreeNode(7)))

        Assert.assertEquals(expectedTree, mergedTree)
    }

}
