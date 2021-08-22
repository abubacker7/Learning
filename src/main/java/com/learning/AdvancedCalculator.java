package com.learning;

public class AdvancedCalculator extends Calculator {

    @Override
    public long add( long num1, long num2 ) {
        return num1 + num2;
    }

    public long add( long numList[] ) {
        long totalSum = 0;
        for ( long num : numList ) {
            totalSum += num;
        }

        return totalSum;
    }
}
