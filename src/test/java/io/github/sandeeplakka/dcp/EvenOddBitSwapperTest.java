package io.github.sandeeplakka.dcp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenOddBitSwapperTest {

    private EvenOddBitSwapper underTest;

    @BeforeEach
    void setUp() {
        underTest = new EvenOddBitSwapper();
    }

    @Test
    void swapBitsV1() {
        assertEquals("1010101",
                Integer.toString(underTest.swapBitsV1(Short.valueOf("10101010", 2)), 2));
        assertEquals("11010001",
                Integer.toString(underTest.swapBitsV1(Short.valueOf("11100010", 2)), 2));
    }

    @Test
    void swapBitsV2() {
        assertEquals("1010101",
                Integer.toString(underTest.swapBitsV2(Short.valueOf("10101010", 2)), 2));
        assertEquals("11010001",
                Integer.toString(underTest.swapBitsV2(Short.valueOf("11100010", 2)), 2));
    }
}