package com.example.maven_github_demo1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class GradeCalculatorTest {
    private final GradeCalculator calculator = new GradeCalculator();

    @Test
    void totalTest() {
        assertEquals(225, calculator.total(70, 80, 75));
    }

    @Test
    void averageTest() {
        assertEquals(75.0, calculator.average(70, 80, 75), 0.001);
    }

    @Test
    void passTest() {
        assertEquals("PASS", calculator.result(75.0));
    }

    @Test
    void failTest() {
        assertEquals("FAIL", calculator.result(35.0));
    }
}