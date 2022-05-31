package com.example.unitarytesting;

import org.junit.Assert;
import org.junit.Test;

public class MathSampleVoidFooTest {

    @Test
    public void voidFooOk() {
        // Arrange
        final MathSample mathSample = new MathSample();
        // Act
        final String result = mathSample.voidFoo("Ok");

        // Assert
        Assert.assertEquals("doing something.", result);
    }

    @Test
    public void voidFoook() {
        // Arrange
        final MathSample mathSample = new MathSample();
        // Act
        final String result = mathSample.voidFoo("ok");

        // Assert
        Assert.assertEquals("doing something.", result);
    }

    @Test
    public void voidFooOK() {
        // Arrange
        final MathSample mathSample = new MathSample();
        // Act
        final String result = mathSample.voidFoo("OK");

        // Assert
        Assert.assertEquals("doing something.", result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void voidFooNotOk() {
        // Arrange
        final MathSample mathSample = new MathSample();
        // Act
        mathSample.voidFoo("whatever");
    }

    @Test(expected = IllegalArgumentException.class)
    public void voidFooEmpty() {
        // Arrange
        final MathSample mathSample = new MathSample();
        // Act
        mathSample.voidFoo("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void voidFooNull() {
        // Arrange
        final MathSample mathSample = new MathSample();
        // Act
        mathSample.voidFoo(null);
    }
}