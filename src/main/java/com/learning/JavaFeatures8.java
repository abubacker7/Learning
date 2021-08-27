package com.learning;

import java.util.Arrays;
import java.util.List;

interface A {
    void show();

    default void defaultMethod() {
        System.out.println("This is a default method");
    }
}

public class JavaFeatures8 {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("ram", "john", "vijay");

        names.stream().forEach( i -> System.out.println(i) );
        names.stream().forEach( System.out::println );

        A functionalInterface = () -> {
            System.out.println( "this is show method" );
        };

        functionalInterface.show();
    }
}
