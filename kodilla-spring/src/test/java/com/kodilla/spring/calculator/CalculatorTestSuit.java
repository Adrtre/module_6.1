package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(classes = {Calculator.class, Display.class})
class CalculatorTestSuit {

    @Autowired
    private Calculator calculator;

    @Test
    void testCalculations() {
        //Given
        double a = 10;
        double b = 5;

        //When
        double sumResult = calculator.add(a, b);
        double subResult = calculator.subtract(a, b);
        double mulResult = calculator.multiply(a, b);
        double divResult = calculator.divide(a, b);

        //Then
        assertEquals(15, sumResult);
        assertEquals(5, subResult);
        assertEquals(50, mulResult);
        assertEquals(2, divResult);
    }
}