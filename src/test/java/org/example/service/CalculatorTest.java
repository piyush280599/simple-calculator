package org.example.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void givenTwoPositiveNumbersThenReturnSum() {

        // given
        int num1 = 20;
        int num2 = 43;

        // when
        int result = calculator.add(num1, num2);

        // then
        assertEquals(63, result);
    }
}