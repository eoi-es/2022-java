package com.example.unitarytesting;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import javax.naming.OperationNotSupportedException;

@RunWith(MockitoJUnitRunner.class)
public class SampleToTestMockitoTest {

    @Mock
    private MathSample mathSampleMock;

    @InjectMocks
    private SampleToTest sampleToTest;

    @Test
    public void mathOperationSum() throws OperationNotSupportedException {
        // Arrange
        Mockito.when(mathSampleMock.sum(1, 2)).thenReturn(4);

        // Act
        Integer result = (Integer) sampleToTest.mathOperation(1, 2, "+");

        // Assert
        Assert.assertEquals(Integer.valueOf(4), result);
        Mockito.verify(mathSampleMock, Mockito.times(1)).sum(1, 2);
        Mockito.verify(mathSampleMock, Mockito.times(0)).divide(Mockito.anyInt(), Mockito.anyInt());
        Mockito.verify(mathSampleMock, Mockito.times(0)).mulitply(Mockito.anyInt(), Mockito.anyInt());
    }

    @Test(expected = OperationNotSupportedException.class)
    public void mathOperationException() throws OperationNotSupportedException {
        // Act
        sampleToTest.mathOperation(1, 2, "WHATEVER");

        // Assert
        Mockito.verify(mathSampleMock, Mockito.times(0)).sum(Mockito.anyInt(), Mockito.anyInt());
        Mockito.verify(mathSampleMock, Mockito.times(0)).divide(Mockito.anyInt(), Mockito.anyInt());
        Mockito.verify(mathSampleMock, Mockito.times(0)).mulitply(Mockito.anyInt(), Mockito.anyInt());
    }

    @Test
    public void concatStringOk() {
        // ACt
        final String result = sampleToTest.concatString("texto flipante");

        // Assert
        Assert.assertEquals("texto flipante - concatenated", result);
    }
}
