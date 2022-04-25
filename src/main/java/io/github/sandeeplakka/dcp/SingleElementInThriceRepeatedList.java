package io.github.sandeeplakka.dcp;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * This problem was asked by Google.
 * <p>
 * Given an array of integers where every integer occurs three times except for one integer,
 * which only occurs once, find and return the non-duplicated integer.
 * <p>
 * For example, given [6, 1, 3, 3, 3, 6, 6], return 1.
 * Given [13, 19, 13, 13], return 19.
 * <p>
 * Do this in O(N) time and O(1) space.
 * <p>
 * Level : Hard
 */
public class SingleElementInThriceRepeatedList {

    //naive approach
    public int findOddElementV1(int[] arr) {
        if (arr == null || arr.length == 0) throw new IllegalArgumentException("Invalid input");
        Map<Integer, Long> counter = Arrays.stream(arr).boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        return counter.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .findFirst()
                .map(Map.Entry::getKey).orElseThrow(IllegalArgumentException::new);
    }

    //Approach under Asked requirements
    public int findOddElementV2(int[] arr) {
        if (arr == null || arr.length == 0) throw new IllegalArgumentException("Invalid input");
        int ones, twos, threes;
        ones = twos = 0;
        for (int n : arr) {
            twos = twos | (ones & n);
            ones = ones ^ n;
            threes = ones & twos;
            ones &= ~threes;
            twos &= ~threes;
        }
        return ones;
    }
}
