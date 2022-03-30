package io.github.sandeeplakka.dcp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class ArrayProductItemsTest {

    private ArrayProductItems arrayProductItems;

    @BeforeEach
    public void init(){
        arrayProductItems = new ArrayProductItems();
    }

    @Test
    void returnProductArray() {
        assertThat(arrayProductItems
                .returnProductArray(new int[]{1, 2, 3, 4, 5})
        ).as("Does not work for [1, 2, 3, 4, 5]")
                .containsExactly(120, 60, 40, 30, 24);

        assertThat(arrayProductItems
                .returnProductArray(new int[]{3, 2, 1})
        ).as("Does not work for [3, 2, 1]")
                .containsExactly(2, 3, 6);
    }

    @Test
    void returnProductArrayFollowUp() {
        assertThat(arrayProductItems
                .returnProductArrayFollowUp(new int[]{1, 2, 3, 4, 5})
        ).as("Does not work for [1, 2, 3, 4, 5]")
                .containsExactly(120, 60, 40, 30, 24);

        assertThat(arrayProductItems
                .returnProductArrayFollowUp(new int[]{3, 2, 1})
        ).as("Does not work for [3, 2, 1]")
                .containsExactly(2, 3, 6);
    }
}