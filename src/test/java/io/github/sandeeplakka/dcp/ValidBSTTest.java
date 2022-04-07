package io.github.sandeeplakka.dcp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidBSTTest {
    private ValidBST underTest;

    @BeforeEach
    public void init() {
        underTest = new ValidBST();
    }

    @Test
    void test_isValidBST_case1() {
        /*
         *    1
         *   / \
         *  2   3
         */
        ValidBST.TreeNode root = new ValidBST.TreeNode(2,
                new ValidBST.TreeNode(1), new ValidBST.TreeNode(3));
        assertTrue(underTest.isValidBST(root));
    }

    @Test
    void test_isValidBST_case2() {
        /*
         *    5
         *   / \
         *  1   4
         *     / \
         *    3   6
         */
        ValidBST.TreeNode root = new ValidBST.TreeNode(5);
        root.left = new ValidBST.TreeNode(1);
        root.right = new ValidBST.TreeNode(4,
                new ValidBST.TreeNode(3), new ValidBST.TreeNode(6));

        assertFalse(underTest.isValidBST(root));

    }

    @Test
    void test_isValidBST_case3() {
        /*
         *    5
         *   / \
         *  1   6
         *     / \
         *    3   7
         */
        ValidBST.TreeNode root = new ValidBST.TreeNode(5);
        root.left = new ValidBST.TreeNode(1);
        root.right = new ValidBST.TreeNode(6,
                new ValidBST.TreeNode(3), new ValidBST.TreeNode(7));

        assertFalse(underTest.isValidBST(root));
    }


}