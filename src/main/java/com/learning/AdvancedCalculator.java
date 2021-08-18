package com.learning;

public class AdvancedCalculator extends Calculator {

    @Override
    public long add( long num1, long num2 ) {
        return num1 + num2;
    }

    public long add( long $args[] ) {
        long totalSum = 0;
        for ( long $arg : $args ) {
            totalSum += $arg;
        }

        return totalSum;
    }
}
