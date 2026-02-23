/*Assignment 2: Multi-Catch Block
Catch IOException and ArithmeticException in a single catch block.
*/

package exceptionHandling;

import java.io.IOException;

public class MultiCatchExample {
    public static void main(String[] args) {
        try {
            int A = 0; 
            
            //  ArithmeticException (Division by zero)
            int result = 100 / A; 
            
            if (result < 0) 
            {
                throw new IOException("File not found!");
            }

            } catch (ArithmeticException | IOException e) 
            {
            
            System.out.println("Error caught: " + e.getClass());//full class name of the object 
            System.out.println("Message: " + e.getMessage());
            }
        
        System.out.println("Program continues...");
    }
}          /*Output: Error caught: class java.lang.ArithmeticException
                     Message: / by zero
                     Program continues...*/
