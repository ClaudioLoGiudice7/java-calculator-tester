package org.lessons.java.calculator;

public class Calculator {
    public float add(float num1, float num2) {
        return num1 + num2;
    }

    public float subtract(float num1, float num2) {
        return num1 - num2;
    }

    public float divide(float num1, float num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            throw new IllegalArgumentException("Non si può dividere per 0!");
        }
    }

    public float multiply(float num1, float num2) {
        return num1 * num2;
    }
}