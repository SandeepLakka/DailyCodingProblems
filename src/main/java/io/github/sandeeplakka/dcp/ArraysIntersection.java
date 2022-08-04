package io.github.sandeeplakka.dcp;

import java.util.HashSet;
import java.util.Set;

/**
 * This problem was recently asked by Amazon
 * <p>
 * Given two arrays, write a function to compute their intersection -
 * the intersection means the numbers that are in both arrays.
 * <p>
 * Example 1:
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * Output: [2]
 * <p>
 * Example 2:
 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * Output: [9,4]
 * <p>
 * Note:
 * Each element in the result must be unique.
 * The result can be in any order.
 * <p>
 * Level: Medium
 */
public class ArraysIntersection {

    //bruteforce approach
    public int[] findIntersection(int[] arr1, int[] arr2) {
        Set<Integer> intersection = new HashSet<>();
        for (int val1 : arr1) {
            for (int val2 : arr2) {
                if (val1 == val2) {
                    intersection.add(val1);
                }
            }
        }
        return intersection.stream().mapToInt(Integer::intValue).toArray();
    }


}
