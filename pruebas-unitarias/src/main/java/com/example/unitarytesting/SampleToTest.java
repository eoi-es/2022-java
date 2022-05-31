package com.example.unitarytesting;

import javax.naming.OperationNotSupportedException;

// TODO: to cover
public class SampleToTest {

    public String concatString(String var) {
        return String.format("%s - concatenated", var);
    }

    public String concatString(String var1, String var2) {
        if (var1 != null && var2 != null) {
            return String.format("%s - %s", var1, var2);
        } else if (var1 != null) {
            return String.format("%s - not value", var1);
        } else if (var2 != null) {
            return String.format("not value - %s", var2);
        } else {
            return null;
        }
    }

    public Number mathOperation(Integer a, Integer b, String operation) throws OperationNotSupportedException {
        final MathSample mathSample = new MathSample();
        switch (operation) {
            case "/":
                return mathSample.divide(a, b);
            case "+":
                return mathSample.sum(a, b);
            case "*":
                return mathSample.mulitply(a, b);
            default:
                throw new OperationNotSupportedException(String.format("Operation %s not supported", operation));
        }
    }
}
