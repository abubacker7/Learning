package com.learning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    @Test
    public void add() {
        var calc = new Calculator();
        long sum = calc.add( 10, 10 );
        assertEquals( 20, sum );
    }
}