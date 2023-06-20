package org.lessons.java.calculator;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        float result = calculator.add(1.5f, 2.5f);
        assertEquals(4.0f, result);
    }

    @Test
    public void testSubtract() {
        float result = calculator.subtract(9.0f, 7.0f);
        assertEquals(2.0f, result);
    }

    @Test
    public void testDivide() {
        float result = calculator.divide(12.0f, 4.0f);
        assertEquals(3.0f, result);
    }

    @Test
    public void testMultiply() {
        float result = calculator.multiply(2.0f, 8.0f);
        assertEquals(16.0f, result);
    }
}