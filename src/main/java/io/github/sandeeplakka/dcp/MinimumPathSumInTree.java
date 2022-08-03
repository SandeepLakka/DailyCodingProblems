package io.github.sandeeplakka.dcp;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class MinimumPathSumInTree {


    public static void main(String[] args) {
        MinimumPathSumInTree ut  = new MinimumPathSumInTree();
        Node root = new Node(10,
                new Node(5,
                        null,
                        new Node(2)
                ),
                new Node(5,
                        null,
                        new Node(1)
                )
        );
        int minSumPath = ut.findMinPath(root);
        System.out.println(minSumPath);

        root = new Node(10,
                new Node(1,
                        null,
                        new Node(2)
                ),
                new Node(5,
                        null,
                        new Node(1)
                )
        );
        minSumPath = ut.findMinPath(root);
        System.out.println(minSumPath);
    }
    public int findMinPath(Node root){
        Set<Integer> pathSums = new HashSet<>();
        findMinPathRecur(root,0,pathSums);
        System.out.println(pathSums);
        return pathSums.stream().mapToInt(Integer::intValue).min().orElse(-1);
    }

    /**
     *   10
     *  /  \
     * 5    5
     *  \     \
     *    2    1
     *        /
     *      -1
     *
     */
    private void findMinPathRecur(Node root, int sum,Set<Integer> pathSums) {
        if(root == null) {
            pathSums.add(sum);
            return;
        }
        sum += root.value;
        findMinPathRecur(root.left,sum,pathSums);
        findMinPathRecur(root.right,sum,pathSums);
    }


    static class Node {
        int value;
        Node left;
        Node right;

        public Node() {
        }

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node left, Node right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }

}
