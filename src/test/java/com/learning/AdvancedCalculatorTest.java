package com.learning;

import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class AdvancedCalculatorTest {

    AdvancedCalculator calc;

    @BeforeAll
    void setUp() {
        calc = new AdvancedCalculator();
    }

    @AfterAll
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