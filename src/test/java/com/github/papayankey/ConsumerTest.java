package com.github.papayankey;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerTest {
    /**
     * Create a consumer which takes list of country names and prints the length
     * of each name to the console.
     */
    @Test
    void Consumer01() {
        List<String> countries = List.of("Ghana", "Nigeria", "Togo", "South Africa");

        // FixME: Create Consumer here
        Consumer<List<String>> consumer = input -> {
            for (String country : input) {
                System.out.println(country);
            }
        };

        consumer.accept(countries);
    }
}
