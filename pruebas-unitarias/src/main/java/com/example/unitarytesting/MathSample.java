package com.example.unitarytesting;

public class MathSample {

    public int doubleANumber(int num) {
        return num * 2;
    }

    public boolean returnABoolean(String inputData) {
        if ("Save".equalsIgnoreCase(inputData)) {
            return true;
        } else {
            return false;
        }
    }

    public String voidFoo(String inputData) {
        if ("Ok".equalsIgnoreCase(inputData)) {
            return "doing something.";
        } else {
            throw new IllegalArgumentException("Bad argument:" + inputData);
        }
    }

    public double divide(Integer a, Integer b) {
        return a / b;
    }

    // TODO: to cover method
    public Integer sum(Integer a, Integer b) {
        return a + b;
    }

    // TODO: to cover method
    public Integer mulitply(Integer a, Integer b) {
        return a * b;
    }
}
