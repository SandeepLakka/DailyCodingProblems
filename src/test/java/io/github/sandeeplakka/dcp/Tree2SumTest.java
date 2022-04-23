package io.github.sandeeplakka.dcp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Tree2SumTest {

    private Tree2Sum underTest;

    @BeforeEach
    public void init() {
        underTest = new Tree2Sum();
    }

    @Test
    public void test_get2SumPair() {
        Tree2Sum.TreeNode root = new Tree2Sum.TreeNode(10,
                new Tree2Sum.TreeNode(5), //left
                new Tree2Sum.TreeNode(15,
                        new Tree2Sum.TreeNode(11),
                        new Tree2Sum.TreeNode(15))
        );
        assertArrayEquals(new int[]{5, 15}, underTest.get2SumPair(root, 20));
        assertNull(underTest.get2SumPair(root, -10));

    }

}