package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CollectionTestSuit {
// Gdzie się wyświetla befpre/after Each ??
    @BeforeEach
    void beforeEach() {
        System.out.println("Starting test");
    }

    @AfterEach
    void afterEach() {
        System.out.println("Finish");
    }

    @Test
    @DisplayName("Checking whether the class behaves correctly when the list is empty")
    void testOddNumbersExterminatorEmptyList() {
        // given
        List<Integer> numbers = new ArrayList<>();
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

        // when
        List<Integer> result = oddNumbersExterminator.exterminate(numbers);

        // then
        assertTrue(result.isEmpty());
    }

    @Test
    @DisplayName("Checking whether the class behaves correctly when the list contains both even and odd numbers")
    void testOddNumbersExterminatorNormalList() {
        // given
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

        // when
        List<Integer> result = oddNumbersExterminator.exterminate(numbers);

        // then
        List<Integer> expected = Arrays.asList(2, 4, 6, 8);
        assertEquals(result, expected);
    }
}