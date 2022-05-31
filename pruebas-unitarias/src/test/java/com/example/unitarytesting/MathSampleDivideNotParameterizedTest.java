package com.example.unitarytesting;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

public class MathSampleDivideNotParameterizedTest {

    @Test(expected = ArithmeticException.class)
    public void divideNotOk() {
        // Arrange
        final MathSample mathSample = new MathSample();

        // Act
        mathSample.divide(6, 0);
    }
}