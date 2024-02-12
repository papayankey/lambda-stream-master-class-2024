package com.github.papayankey;

import org.junit.jupiter.api.Test;

import java.util.function.Predicate;
import java.util.regex.Pattern;

import static org.assertj.core.api.Assertions.assertThat;

public class PredicateCompositionTest {
    /**
     * Create a Predicate composition which validates a customer email address and name length.
     */
    @Test
    void PredicateComposition01() {
        int MINIMUM_NAME_LENGTH = 3;
        String emailPattern = "^[A-Za-z0-9._%-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}$";
        record Customer(String name, String email) {
        }

        // FixMe: Create Predicate composition here
        Predicate<Customer> isValidEmail = customer -> Pattern.matches(emailPattern, customer.email());
        Predicate<Customer> isValidName = customer -> customer.name().length() >= MINIMUM_NAME_LENGTH;
        Predicate<Customer> isValidCustomer = isValidEmail.and(isValidName);

        boolean result = isValidCustomer.test(new Customer("Mia", "mia@gmail.com"));

        assertThat(result).isTrue();
    }
}
