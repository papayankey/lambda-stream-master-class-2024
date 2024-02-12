package com.github.papayankey;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.function.Supplier;

import static org.assertj.core.api.Assertions.assertThat;

public class SupplierTest {
    /**
     * Create a Supplier which returns list of country names.
     */
    @Test
    void Supplier01() {
        // FixME: Create Supplier here
        Supplier<List<String>> supplier = () -> List.of("Ghana", "Nigeria", "Togo");

        List<String> result = supplier.get();

        assertThat(result).containsExactly("Ghana", "Nigeria", "Togo");
    }
}
