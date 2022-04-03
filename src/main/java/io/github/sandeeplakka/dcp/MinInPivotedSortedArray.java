package io.github.sandeeplakka.dcp;

/**
 * This problem was asked by Uber.
 * <p>
 * Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
 * Find the minimum element in O(log N) time. You may assume the array does not contain duplicates.
 * <p>
 * For example, given [5, 7, 10, 3, 4], return 3.
 * <p>
 * Level: Medium
 */
public class MinInPivotedSortedArray {

    public int getMin(int[] arr) {
        int lo = 0;
        int hi = arr.length - 1;
        int mid = (lo + hi) / 2;
        while (lo < hi) {

            if (arr[mid] > arr[hi]) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
            mid = (lo + hi) / 2;
        }
        return arr[hi];
    }
}
