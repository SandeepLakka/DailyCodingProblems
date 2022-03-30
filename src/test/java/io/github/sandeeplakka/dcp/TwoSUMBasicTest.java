package io.github.sandeeplakka.dcp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class TwoSUMBasicTest {

    private TwoSUMBasic twoSUMBasic;

    @BeforeEach
    public void init() {
        twoSUMBasic = new TwoSUMBasic();
    }

    @Test
    void test_isPairPresent() {
        assertThat(twoSUMBasic.isPairPresent(new int[]{1, 2, 3, 4}, 4)).isTrue();
        assertThat(twoSUMBasic.isPairPresent(new int[]{1, 2, 3, 4}, 5)).isTrue();
        assertThat(twoSUMBasic.isPairPresent(new int[]{1, 1, 1, 1}, 4)).isFalse();
        assertThat(twoSUMBasic.isPairPresent(new int[]{10, 15, 3, 7}, 17)).isTrue();
    }

    @Test
    void test_isPairPresentBonusCase() {
        assertThat(twoSUMBasic.isPairPresentBonusCase(new int[]{1, 2, 3, 4}, 4)).isTrue();
        assertThat(twoSUMBasic.isPairPresentBonusCase(new int[]{1, 2, 3, 4}, 5)).isTrue();
        assertThat(twoSUMBasic.isPairPresentBonusCase(new int[]{1, 1, 1, 1}, 4)).isFalse();
        assertThat(twoSUMBasic.isPairPresentBonusCase(new int[]{10, 15, 3, 7}, 17)).isTrue();
    }
}