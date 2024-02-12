package com.github.papayankey;

import org.junit.jupiter.api.Test;

import java.util.function.BinaryOperator;

import static org.assertj.core.api.Assertions.assertThat;

public class BinaryOperatorTest {
    /**
     * Create a BinaryOperator which takes two integers and returns their sum.
     */
    @Test
    void BinaryOperatorTest01() {
        // FixME: Create BinaryOperator here

        int result = add.apply(1, 2);

        assertThat(result).isEqualTo(3);
    }

    /**
     * Create a BinaryOperator which takes two integers and returns the minimum value.
     */
    @Test
    void BinaryOperatorTest02() {
        // FixME: Create BinaryOperator here

        int result = min.apply(1, 2);

        assertThat(result).isEqualTo(1);
    }
}
