package io.github.sandeeplakka.dcp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinInPivotedSortedArrayTest {

    private MinInPivotedSortedArray underTest;

    @BeforeEach
    public void init() {
        underTest = new MinInPivotedSortedArray();
    }

    @Test
    void test_getMin_SortedRotatedArrays() {
        assertEquals(3, underTest.getMin(new int[]{5, 7, 10, 3, 4}));
        assertEquals(2, underTest.getMin(new int[]{4, 8, 12, 2}));
        assertEquals(1, underTest.getMin(new int[]{5, 1, 2, 3, 4}));
        assertEquals(1, underTest.getMin(new int[]{2, 3, 4, 5, 6, 7, 8, 1}));
    }

    @Test
    void test_getMin_SortedArrays() {
        assertEquals(1, underTest.getMin(new int[]{1, 8, 10, 12, 15}));
        assertEquals(1, underTest.getMin(new int[]{1, 2}));
        assertEquals(2, underTest.getMin(new int[]{2, 4, 6, 8}));
        assertEquals(2, underTest.getMin(new int[]{9, 7, 5, 3, 2}));
        assertEquals(1, underTest.getMin(new int[]{2, 1}));
    }

    @Test
    public void getMin_EdgeCases() {
        assertEquals(1, underTest.getMin(new int[]{2,3,1}));
        assertEquals(1, underTest.getMin(new int[]{1}));
        assertEquals(1, underTest.getMin(new int[]{1, 2}));

    }
}