package com.learning;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AdvancedCalculatorTest {

    AdvancedCalculator calc;

    @BeforeEach
    void setUp() {
        calc = new AdvancedCalculator();
    }

    @AfterEach
    void tearDown() {
        calc = null;
    }

    @Test
    void add() {
        Assertions.assertEquals( 17, calc.add(9, 8) );
    }

    @Test
    void testAdd() {
        long numbers[] = { 2, 2, 9, 8 };
        Assertions.assertEquals( 21, calc.add(numbers) );
    }
}