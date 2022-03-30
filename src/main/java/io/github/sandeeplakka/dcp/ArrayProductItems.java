package io.github.sandeeplakka.dcp;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

/**
 * This problem was asked by Uber.
 * <p>
 * Given an array of integers, return a new array such that each element at index i
 * of the new array is the product of all the numbers in the original array except the one at i.
 * <p>
 * For example, if our input was [1, 2, 3, 4, 5],
 * the expected output would be [120, 60, 40, 30, 24].
 * If our input was [3, 2, 1], the expected output would be [2, 3, 6].
 * <p>
 * Follow-up: what if you can't use division?
 */
public class ArrayProductItems {

    public long[] returnProductArray(int[] arr) {
        long product = Arrays.stream(arr).reduce(1, (a, b) -> a * b);
        return Arrays.stream(arr).mapToLong(val -> (int) (product / val)).toArray();
    }

    public long[] returnProductArrayFollowUp(int[] arr) {
        long[] left = new long[arr.length];
        long[] right = new long[arr.length];

        long leftIdentity = 1;
        long rightIdentity = 1;

        for (int i = 0; i < arr.length; i++) {
            left[i] = leftIdentity;
            right[arr.length - 1 - i] = rightIdentity;

            leftIdentity *= arr[i];
            rightIdentity *= arr[arr.length - 1 - i];
        }

        return IntStream.range(0, arr.length)
                .mapToLong(idx -> left[idx] * right[idx])
                .toArray();
    }
}
