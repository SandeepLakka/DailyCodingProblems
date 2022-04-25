package io.github.sandeeplakka.dcp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingleElementInThriceRepeatedListTest {

    private SingleElementInThriceRepeatedList underTest;

    @BeforeEach
    public void init() {
        underTest = new SingleElementInThriceRepeatedList();
    }

    @Test
    void test_findOddElementV1_normal_cases() {
        assertEquals(1, underTest.findOddElementV1(new int[]{6, 1, 3, 3, 3, 6, 6}));
        assertEquals(19, underTest.findOddElementV1(new int[]{13, 19, 13, 13}));
        assertEquals(2, underTest.findOddElementV1(new int[]{2}));
    }

    @Test
    void test_findOddElementsV1_exceptional_cases() {
        assertThrows(IllegalArgumentException.class, () -> underTest.findOddElementV1(new int[]{}));
        assertThrows(IllegalArgumentException.class, () -> underTest.findOddElementV1(null));
    }

    @Test
    void test_findOddElementV2_normal_cases() {
        assertEquals(1, underTest.findOddElementV2(new int[]{6, 1, 3, 3, 3, 6, 6}));
        assertEquals(19, underTest.findOddElementV2(new int[]{13, 19, 13, 13}));
        assertEquals(2, underTest.findOddElementV2(new int[]{2}));
    }

    @Test
    void test_findOddElementsV2_exceptional_cases() {
        assertThrows(IllegalArgumentException.class, () -> underTest.findOddElementV2(new int[]{}));
        assertThrows(IllegalArgumentException.class, () -> underTest.findOddElementV2(null));
    }
}