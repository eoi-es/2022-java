package com.example.unitarytesting;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

@RunWith(Parameterized.class)
public class MathSampleReturnABooleanTest {

    private String input;
    private Boolean expected;

    @Parameterized.Parameters(name = "Input: {index} -> returnABoolean({0})={1}")
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { "Save", true }, { "save", true }, { "", false }, { null, false }
        });
    }

    public MathSampleReturnABooleanTest(String input, Boolean expected) {
        this.input = input;
        this.expected = expected;
    }

    @Test
    public void returnABoolean() {
        // Arrange
        final MathSample mathSample = new MathSample();

        // Act
        Boolean result = mathSample.returnABoolean(this.input);

        // Assert
        Assert.assertEquals(this.expected, result);
    }
}