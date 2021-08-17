package com.learning;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void add() {
        var calc = new Calculator();
        long result = calc.add( 17, 22 );
        Assertions.assertEquals( 39, result );
    }

    @Test
    void sub() {
        var calc = new Calculator();
        long result = calc.sub( 17, 22 );
        Assertions.assertEquals( -5, result );
    }

    @Test
    void multiply() {
        var calc = new Calculator();
        long result = calc.multiply( 3, 4 );
        Assertions.assertEquals( 12, result );
    }

    @Test
    void division() {
        var calc = new Calculator();
        long result = calc.division( 16, 4 );
        Assertions.assertEquals( 4, result );
    }
}