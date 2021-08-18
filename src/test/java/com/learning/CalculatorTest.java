package com.learning;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.Assertions;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CalculatorTest {

    Calculator calc;

    @BeforeAll
    public void setup() {
        calc = new Calculator();
    }

    @AfterAll
    public void teardown() {
        calc = null;
    }

    @Test
    public void add() {
        Assertions.assertEquals( 39, calc.add(17, 22) );
    }

    @Test
    void sub() {
        Assertions.assertEquals( -5, this.calc.sub(17, 22) );
    }

    @Test
    void multiply() {
        Assertions.assertEquals( 12, this.calc.multiply(3, 4) );
    }

    @Test
    void division() {
        Assertions.assertEquals( 4, this.calc.division(16, 4) );
    }
}