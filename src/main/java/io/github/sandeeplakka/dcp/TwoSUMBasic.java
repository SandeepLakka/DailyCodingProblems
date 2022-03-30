package io.github.sandeeplakka.dcp;

import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

/**
 * This problem was recently asked by Google.
 * <p>
 * Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
 * <p>
 * For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
 * <p>
 * Bonus: Can you do this in one pass?
 */
public class TwoSUMBasic {

    public boolean isPairPresent(int[] arr, int k) {
        int[] arrCopy = Arrays.stream(arr).sorted().toArray();
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int sum = arr[i] + arr[j];
            if (sum == k) {
                return true;
            }
            if (sum > k) {
                j--;
            } else {
                i++;
            }
        }
        return false;
    }

    public boolean isPairPresentBonusCase(int[] arr, int k) {
        Set<Integer> numbersTraversed = new HashSet<>();
        for (int val : arr) {
            if (numbersTraversed.contains(k - val)) return true;
            numbersTraversed.add(val);
        }
        return false;
    }
}
