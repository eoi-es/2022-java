package com.example.unitarytesting;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

@RunWith(Parameterized.class)
public class MathSampleDoubleNumberTest {

    private Integer input;
    private int expected;

    @Parameterized.Parameters(name = "Input: {index} -> doubleANumber({0})={1}")
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { 0, 0 }, { 1, 2 }, { 2, 4 }, { 4, 8 }, { 100, 200 }
        });
    }

    public MathSampleDoubleNumberTest(Integer input, int expected) {
        this.input = input;
        this.expected = expected;
    }

    @Test
    public void doubleANumber() {
        // Arrange
        final MathSample mathSample = new MathSample();

        // Act
        int result = mathSample.doubleANumber(this.input);

        // Assert
        Assert.assertEquals(this.expected, result);
    }
}