package io.github.sandeeplakka.dcp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class ArraysIntersectionTest {

    private ArraysIntersection ut;

    @BeforeEach
    public void init() {
        ut = new ArraysIntersection();
    }

    @Test
    void test_findIntersection_for_same_lements() {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {2, 3, 1};
        int[] expected = {1, 2, 3};
        testEquality(arr1, arr2, expected);
    }

    @Test
    void test_findIntersection_for_diff_elements() {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {5, 0, 4};
        int[] expected = {};
        testEquality(arr1, arr2, expected);
    }

    @Test
    void test_findIntersection_for_few_common_elements() {
        int[] arr1 = {9, 2, 4, 5};
        int[] arr2 = {1, 5, 2, 7};
        int[] expected = {2, 5};
        testEquality(arr1, arr2, expected);
    }

    @Test
    void test_findIntersection_for_few_common_duplicate_elements() {
        int[] arr1 = {9, 2, 4, 5, 4, 5};
        int[] arr2 = {1, 5, 2, 7, 2, 2, 2};
        int[] expected = {2, 5};
        testEquality(arr1, arr2, expected);
    }

    private void testEquality(int[] arr1, int[] arr2, int[] expected) {
        int[] actual = Arrays.stream(ut.findIntersection(arr1, arr2)).sorted().toArray();
        assertArrayEquals(expected, actual);
    }
}