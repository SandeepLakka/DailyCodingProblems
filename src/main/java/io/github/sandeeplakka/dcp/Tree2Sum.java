package io.github.sandeeplakka.dcp;

import java.util.ArrayList;
import java.util.List;

/**
 * his problem was asked by Google.
 * <p>
 * Given the root of a binary search tree, and a target K, return two nodes in the tree whose sum equals K.
 * <p>
 * For example, given the following tree and K of 20
 * <pre>
 *     10
 *    /   \
 *  5      15
 *        /  \
 *      11    15
 * </pre>
 * Return the nodes 5 and 15.
 * <p>
 * Level : Easy
 */
public class Tree2Sum {

    //naive approach
    public int[] get2SumPair(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        getInOrderListOfTree(root, list);
        System.out.println("In-order Traversal of Tree  : " + list);
        Integer[] arr = list.toArray(new Integer[0]);
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == k) {
                    return new int[]{Math.min(arr[i], arr[j]), Math.max(arr[i], arr[j])};
                }
            }
        }
        return null;
    }

    private void getInOrderListOfTree(TreeNode node, List<Integer> list) {
        if (node == null) return;
        getInOrderListOfTree(node.left, list);
        list.add(node.data);
        getInOrderListOfTree(node.right, list);
    }

    static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        public TreeNode(int data, TreeNode left, TreeNode right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }

        public TreeNode(int data) {
            this.data = data;
        }
    }
}
