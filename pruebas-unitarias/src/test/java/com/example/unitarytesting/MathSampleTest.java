package com.example.unitarytesting;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ MathSampleDivideTest.class, MathSampleDivideNotParameterizedTest.class,
        MathSampleReturnABooleanTest.class, MathSampleDoubleNumberTest.class,
        MathSampleVoidFooTest.class })
public class MathSampleTest {
}