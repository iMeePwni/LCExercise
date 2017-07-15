import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by guofeng on 2017/7/15.
 */
public class BalancedBinaryTreeTest {

    private TreeNode treeNode;
    private boolean balanced;

    @Test
    public void isBalanced() throws Exception {
        treeNode = new TreeNode(3, null, null);
        balanced = new BalancedBinaryTree().isBalanced(treeNode);
        assertTrue(balanced);
    }

}