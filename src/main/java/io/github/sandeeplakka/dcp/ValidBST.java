package io.github.sandeeplakka.dcp;

/**
 * This problem was asked by LinkedIn.
 * <p>
 * Determine whether a tree is a valid binary search tree.
 * <p>
 * A binary search tree is a tree with two children, left and right,
 * and satisfies the constraint that the key in the left child
 * must be less than or equal to the root and the key
 * in the right child must be greater than or equal to the root.
 * <p>
 * Level: Medium
 */
public class ValidBST {

    //naive basic case approach : doesn't solve the problem
    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        boolean res = true;

        if (root.left != null) {
            res = res && (root.val >= root.left.val);
        }
        if (root.right != null) {
            res = res && (root.val <= root.right.val);
        }
        return res &&
                isValidBST(root.left) &&
                isValidBST(root.right);
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
