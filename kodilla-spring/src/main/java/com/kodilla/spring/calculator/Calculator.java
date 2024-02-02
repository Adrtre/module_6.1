package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {

    private Display display;

    @Autowired
    public Calculator(Display display) {
        this.display = display;
    }

    public double add(double a, double b) {
        double result = a + b;
        display.displayValue(result);
        return result;
    }

    public double subtract(double a, double b) {
        double result = a - b;
        display.displayValue(result);
        return result;
    }

    public double multiply(double a, double b) {
        double result = a * b;
        display.displayValue(result);
        return result;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Dzielenie przez zero!");
        }
        double result = a / b;
        display.displayValue(result);
        return result;
    }
}
