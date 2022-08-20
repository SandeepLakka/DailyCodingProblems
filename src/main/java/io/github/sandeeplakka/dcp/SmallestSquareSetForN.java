package io.github.sandeeplakka.dcp;

import java.util.*;

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


    public static void main(String[] args) {
        SmallestSquareSetForN ut = new SmallestSquareSetForN();
        System.out.println(ut.getNumberOfPerfectSquaresForN(5));
        System.out.println(ut.getNumberOfPerfectSquaresForN(17));

    }

    //TODO add impl
    public int getNumberOfPerfectSquaresForN(int n) {
        List<Integer> squares = new ArrayList<>();
        for (int i = 1; i * i < n; i++) {
            squares.add(i * i);
        }

        int[][] values = new int[n + 1][squares.size() + 1];
        Arrays.stream(values).forEach(ints -> Arrays.fill(ints, -1));

        return findMinVariations(values, 0, squares, n, squares.size() - 1);
    }

    private int findMinVariations(int[][] values, int res, List<Integer> squares, int n, int idx) {
        if (n <= 0 || idx <= 0) {
            return 1;
        }
        if (values[n][idx] != -1) {
            return values[n][idx];
        }
        int selected = 1+findMinVariations(values, res+1, squares, n - squares.get(idx), idx);
        int unselected = findMinVariations(values, res, squares, n, idx - 1);
        System.out.println("Selected : "+selected+", Unselected : "+unselected);
        return values[n][idx] = Math.min(
                //Selection case
                selected,
                //Non Selection case
                unselected
        );
    }
}
