package com.learning;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void add() {
        var calc = new Calculator();
        long sum = calc.add( 11, 10 );
        Assertions.assertEquals( 21, sum );
    }

    /*@BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testAdd() {
    }

    @Test
    void sub() {
    }

    @Test
    void multiply() {
    }

    @Test
    void division() {
    }*/
}