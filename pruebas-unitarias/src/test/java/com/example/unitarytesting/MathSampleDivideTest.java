package com.example.unitarytesting;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

@RunWith(Parameterized.class)
public class MathSampleDivideTest {
    private Integer input1;
    private Integer input2;
    private Double expected;

    @Parameterized.Parameters(name = "Input: {index} -> divide({0}, {1})={2}")
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { 0, 1, Double.valueOf(0d) }, { 6, 2, Double.valueOf(3d) }
        });
    }

    public MathSampleDivideTest(Integer input1, Integer input2, Double expected) {
        this.input1 = input1;
        this.input2 = input2;
        this.expected = expected;
    }

    @Test
    public void divideOk() {
        // Arrange
        final MathSample mathSample = new MathSample();

        // Act
        double result = mathSample.divide(input1, input2);

        // Arrange
        Assert.assertEquals(expected, result, 2);
    }
}