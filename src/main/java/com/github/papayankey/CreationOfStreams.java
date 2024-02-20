package com.github.papayankey;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreationOfStreams {
    public static void main(String[] args) {
        // From values
        Stream<Integer> integerStream = Stream.of(1, 2, 3);

        // From collection
        List<Integer> integers = List.of(1, 2, 3);
        Stream<Integer> stream = integers.stream();

        Map<String, Integer> stringIntegerMap = Map.of("1", 1, "2", 2, "3", 3);
        Stream<Map.Entry<String, Integer>> stream1 = stringIntegerMap.entrySet().stream();
        Stream<String> stream2 = stringIntegerMap.keySet().stream();
        Stream<Integer> stream3 = stringIntegerMap.values().stream();

        // From arrays
        int[] arr = {1, 2, 3};
        IntStream stream4 = Arrays.stream(arr);

        // From builder
        Stream<Object> build = Stream.builder().add(1).add(2).add(3).build();

        // Empty stream
        Stream<Object> empty = Stream.empty();

        // Infinite stream
        Stream.iterate(1, v -> v + 1)
                .limit(2)
                .forEach(System.out::println);

        Stream.generate(() -> 2)
                .limit(5)
                .forEach(System.out::println);

    }
}
