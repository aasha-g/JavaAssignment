package exceptionHandling;

import java.io.IOException;

public class MultiCatchExample {
    public static void main(String[] args) {
        try {
            int denominator = 0; 
            
            //  ArithmeticException (Division by zero)
            int result = 100 / denominator; 
            
            if (result > 0) 
            {
                throw new IOException("File not found!");
            }

            } catch (ArithmeticException | IOException e) 
            {
            // This one block handles BOTH types of errors
            System.out.println("Error caught: " + e.getClass().getSimpleName());
            System.out.println("Message: " + e.getMessage());
            }
        
        System.out.println("Program continues...");
    }
}

