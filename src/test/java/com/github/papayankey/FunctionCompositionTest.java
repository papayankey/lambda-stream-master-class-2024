package com.github.papayankey;

import org.junit.jupiter.api.Test;

import java.util.function.Function;
import java.util.function.UnaryOperator;

import static org.assertj.core.api.Assertions.assertThat;

public class FunctionCompositionTest {
    /**
     * Create a Function composition which takes a number multiply by 2 and add 10 then returns
     * the result.
     */
    @Test
    void FunctionComposition01() {
        // FixMe: Create Function Composition here
        UnaryOperator<Integer> multiplyByTwo = n -> n * 2;
        UnaryOperator<Integer> add10 = n -> n + 10;
        Function<Integer, Integer> multiplyThenAdd = multiplyByTwo.andThen(add10);

        int result = multiplyThenAdd.apply(5);

        assertThat(result).isEqualTo(20);
    }
}
