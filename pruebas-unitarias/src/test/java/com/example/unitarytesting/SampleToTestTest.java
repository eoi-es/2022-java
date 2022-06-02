package com.example.unitarytesting;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class SampleToTestTest {

    @InjectMocks
    private SampleToTest sampleToTest;

    @Test
    public void concatStringOk() {
        // Arrange (preparación)
        final String var1 = "texto flipante";
        // Act
        final String result = sampleToTest.concatString(var1);
        // Assert
        Assert.assertEquals("texto flipante - concatenated", result);
    }
}
