package io.github.sandeeplakka.dcp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuplicateFinderInLinearSpaceTimeTest {

    DuplicateFinderInLinearSpaceTime ut;

    @BeforeEach
    void setUp() {
        ut = new DuplicateFinderInLinearSpaceTime();
    }

    @Test
    void test_getDuplicateItem_for_empty_array() {
        int expected = 0;
        int[] input = new int[]{};
        assertEquals(expected, ut.getDuplicateItem(input));
    }

    @Test
    void test_getDuplicateItem_for_non_empty_array() {
        int expected = 3;
        int[] input = new int[]{2,3,1,3};
        assertEquals(expected, ut.getDuplicateItem(input));
    }
}