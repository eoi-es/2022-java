package com.example.unitarytesting;

import org.junit.Assert;
import org.junit.Test;

public class SampleToTestTest {

    @Test
    public void concatStringOk() {
        // Arrange (preparación)
        final SampleToTest sampleToTest = new SampleToTest();
        final String var1 = "texto flipante";
        // Act
        final String result = sampleToTest.concatString(var1);
        // Assert
        Assert.assertEquals("texto flipante - concatenated", result);
    }
}
