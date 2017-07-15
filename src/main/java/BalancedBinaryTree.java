/**
 * Created by guofeng on 2017/7/15.
 */
public class BalancedBinaryTree {
    boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        return getHeight(root) != -1;
    }

    int getHeight(TreeNode node) {
        if (node == null) return 0;
        int lh = getHeight(node.getLeft());
        if (lh == -1) return -1;
        int rh = getHeight(node.getRight());
        if (rh == -1) return -1;
        if (Math.abs(lh - rh) > 1) return -1;
        return Math.max(lh, rh) + 1;
    }
}
