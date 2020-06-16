/**
 * Given a binary tree, determine if it is height-balanced.
 * For this problem, a height-balanced binary tree is defined as:
 * a binary tree in which the left and right subtrees of every node differ in height by no more than 1.
 *
 * Example 1:
 * Given the following tree [3,9,20,null,null,15,7]:
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * Return true.
 *
 * Example 2:
 * Given the following tree [1,2,2,3,3,null,null,4,4]:
 *
 *        1
 *       / \
 *      2   2
 *     / \
 *    3   3
 *   / \
 *  4   4
 * Return false.
 */
public class BalancedBinaryTree {

    //Recursive Process
    public static class Solution1 {
        public boolean isBalanced(TreeNode root) {
            if (root == null) {
                return true;
            }
            if (Math.abs(getHeight(root.left) - getHeight(root.right)) > 1) {
                return false;
            } else {
                return isBalanced(root.left) && isBalanced(root.right);
            }
        }

        public int getHeight(TreeNode root) {
            if (root == null) {
                return 0;
            }
            int left = getHeight(root.left);
            int right = getHeight(root.right);
            return Math.max(left, right) + 1;
        }
    }

    //Iterative process
    public static class Solution2 {

    }
}
