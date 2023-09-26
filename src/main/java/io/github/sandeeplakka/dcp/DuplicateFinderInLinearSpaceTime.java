package io.github.sandeeplakka.dcp;

import java.util.Arrays;

public class DuplicateFinderInLinearSpaceTime {
    /**
     * This problem was asked by Google.
     *
     * You are given an array of length n + 1 whose elements belong to the set {1, 2, ..., n}.
     * By the pigeonhole principle, there must be a duplicate.
     * Find it in linear time and space.
     */

    public int getDuplicateItem(int[] input){
        int expectedSum = (input.length-1)*input.length/2;
        int actualSum = Arrays.stream(input).sum();
        return actualSum - expectedSum;
    }

}
