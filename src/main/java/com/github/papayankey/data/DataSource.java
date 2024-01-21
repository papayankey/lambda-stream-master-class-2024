package com.github.papayankey.data;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class DataSource {
    public static List<Customer> getData() {
        List<Customer> customers = Collections.emptyList();
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            File dataFile = new File("src/main/resources/data.json");
            customers = objectMapper.readValue(dataFile, new TypeReference<>() {
            });
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return customers;
    }
}
