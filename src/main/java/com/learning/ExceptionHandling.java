package com.learning;

class CustomException extends Exception {
    String msg;

    CustomException(String msg) {
        this.msg = msg;
    }

    public String toString() {
        return ( "Exception " + msg ) ;
    }
}

public class ExceptionHandling {

    public static void exceptionThrow() {
        throw new ArrayIndexOutOfBoundsException( "Exception Throw" );
    }

    public static void customExceptionThrow() throws CustomException {
        throw new CustomException( "Custom" );
    }

    public static void main(String[] args) throws Exception {
        try {
            int x = 10/0;
        } catch ( ArithmeticException e ) {
            System.out.println( "Can't divide by zero " + e );
        }

        finally {
            System.out.println( "Finally block will execute whether exception occurred or not" );
        }

        try {
            int[] y = new int[5];
            y[0] = 2;
            y[1] = 7;
            y[2] = 9;
            y[3] = 1;
            y[4] = 4;

            System.out.println( y[9] );
        } catch ( ArithmeticException e ) {
            System.out.println( "Can't divide by zero " + e );
        } catch ( ArrayIndexOutOfBoundsException e ) {
            System.out.println( "Array length exceed " + e );
        }

        exceptionThrow();

        customExceptionThrow();
    }
}
