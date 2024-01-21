package com.github.papayankey.data;

public record Customer(
        int id,
        String firstName,
        String lastName,
        String email,
        int age,
        String gender) {
}
