package com.learning;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

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
        ArrayList<Long> numbers = new ArrayList<>();
        numbers.add(10L);
        numbers.add(35L);
        numbers.add(30L);
        Assertions.assertEquals( 75, calc.add(numbers) );
    }

    @Test
    void addTenNumbers() {
        long[] numbers = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 2 };
        Assertions.assertEquals(11, this.calc.addTenNumbers(numbers));
    }
}