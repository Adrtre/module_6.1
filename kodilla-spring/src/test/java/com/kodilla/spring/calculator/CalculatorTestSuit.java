package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
class CalculatorTestSuit {

    @Autowired
    private Calculator calculator;
    @Test
    void testCalculationsSum() {
        //Given
        double a = 10;
        double b = 5;
        //When
        double sumResult = calculator.add(a, b);
        //Then
        assertEquals(15, sumResult);
    }

    @Test
    void testCalculationsSub() {
        //Given
        double a = 10;
        double b = 5;
        //When
        double subResult = calculator.subtract(a, b);
        //Then
        assertEquals(5, subResult);

    }

    @Test
    void testCalculationsMul() {
        //Given
        double a = 10;
        double b = 5;
        //When
        double mulResult = calculator.multiply(a, b);
        //Then
        assertEquals(50, mulResult);

    }

    @Test
    void testCalculationsDiv() {
        //Given
        double a = 10;
        double b = 5;
        //When
        double divResult = calculator.divide(a, b);
        //Then
        assertEquals(2, divResult);
    }
    @Test
    void testCalculationsDiv0() {
        //Given
        double a = 10;
        double b = 0;
        //When , Then
        assertThrows(IllegalArgumentException.class,
                () -> {
                    calculator.divide(a, b);
                });
    }

}