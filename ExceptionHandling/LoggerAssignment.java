/*Assignment 5: Exception Logging
Log exceptions using System.err.println() or Java Logging API.*/


package exceptionHandling;

public class LoggerAssignment {

    public static void divide(int a, int b) {
        try {
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.err.println("Error occurred: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        divide(10, 0);  // This will cause exception
    }
}        // Output:Error occurred: / by zero
