package io.github.sandeeplakka.dcp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmallestSquareSetForNTest {

    private SmallestSquareSetForN ut;

    @BeforeEach
    void setUp() {
        ut = new SmallestSquareSetForN();
    }

    @Test
    void tests_getNumberOfPerfectSquaresForN_for_basic_cases() {
        assertEquals(1, ut.getNumberOfPerfectSquaresForN(4));   // 4
        assertEquals(3, ut.getNumberOfPerfectSquaresForN(12));  // 4+4+4
        assertEquals(3, ut.getNumberOfPerfectSquaresForN(6));   // 1+1+4
        assertEquals(2, ut.getNumberOfPerfectSquaresForN(17));  // 1+16
        assertEquals(2, ut.getNumberOfPerfectSquaresForN(18));  // 9+9
        assertEquals(1, ut.getNumberOfPerfectSquaresForN(100)); // 100
    }
}