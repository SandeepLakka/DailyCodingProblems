package io.github.sandeeplakka.dcp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Write a program that determines the smallest number of perfect squares that sum up to N.
 * <p>
 * Here are a few examples:
 * <p>
 * Given N = 4, return 1 (4) <br>
 * Given N = 17, return 2 (16 + 1) <br>
 * Given N = 18, return 2 (9 + 9) <br>
 */
public class SmallestSquareSetForN {

    public int getNumberOfPerfectSquaresForN(int n) {
        //procuring squares under input N
        List<Integer> squares = new ArrayList<>();
        for (int i = 1; i * i <= n; i++) {
            squares.add(i * i);
        }

        //memo
        int[][] values = new int[n + 1][squares.size() + 1];
        //initialization
        Arrays.stream(values).forEach(ints -> Arrays.fill(ints, -1));

        //memoized recursive calls to find the minimum number of squares sum to equal to N
        return findMinVariations(values, squares, n, squares.size());
    }

    private int findMinVariations(int[][] values, List<Integer> squares, int n, int idx) {
        //idx   : if all choices are exhausted, then there's no solution in this iteration, return MAX_VALUE - 1
        //n     : if n goes below 0, then there's no solution in this iteration, return MAX_VALUE - 1
        if (n < 0 || idx == 0) {
            return Integer.MAX_VALUE - 1;
        }
        //If n becomes 0, then it means there's a definite match
        if (n == 0) {
            return 0;
        }
        //Use memo to avoid re-computation
        if (values[n][idx] != -1) {
            return values[n][idx];
        }
        //Iteration in which we consider the current square value (squares.get(idx-1)) in min set
        int selected = 1 + findMinVariations(values, squares, n - squares.get(idx - 1), idx);
        //Iteration in which we do not consider the current square value (squares.get(idx-1)) in min set
        int unselected = findMinVariations(values, squares, n, idx - 1);

        //Taking the minimum value of the above select/unselect cases
        return values[n][idx] = Math.min(selected, unselected);
    }
}
