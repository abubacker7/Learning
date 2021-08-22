package com.learning;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AdvancedCalculator extends Calculator {

    @Override
    public long add( long num1, long num2 ) {
        return num1 + num2;
    }

    public long add( List<Long> numList ) {
        long totalSum = 0;
        for ( long num : numList ) {
            totalSum += num;
        }

        return totalSum;
    }

    public long addTenNumbers( long[] numbers ) {
        long sumOfNumbers = 0;
        for ( long number : numbers ) {
            sumOfNumbers += number;
        }

        return sumOfNumbers;
    }
}
