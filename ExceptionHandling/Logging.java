package exceptionHandling;

public class Logging {
    public static void main(String[] args) {
        try {
            int A = 10 / 0; // Trigger an error
        } catch (ArithmeticException e) {
            // Log the error message to the error stream
            System.err.println("LOG ERROR: Math went wrong. " + e.getMessage());
        }
    }
}
