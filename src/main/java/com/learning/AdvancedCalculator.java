package com.learning;

import java.util.ArrayList;
import java.util.Iterator;

public class AdvancedCalculator extends Calculator {

    @Override
    public long add( long num1, long num2 ) {
        return num1 + num2;
    }

    public long add(ArrayList<Long> args ) {
        Iterator<Long> argsIterator = args.iterator();

        long additionOfNumbers = 0;
        while ( argsIterator.hasNext() ) {
            additionOfNumbers += argsIterator.next();
        }

        return additionOfNumbers;
    }

    public long addTenNumbers( long[] numbers ) {
        long sumOfNumbers = 0;
        for ( long number : numbers ) {
            sumOfNumbers += number;
        }

        return sumOfNumbers;
    }
}
