package exceptionHandling;

public class NestedTry {
    public static void main(String[] args) {
        // Outer Try: Handles the array access
        try {
            int[] numbers = {10, 20, 30};
            int divisor = 0;

            System.out.println("Accessing array...");

            // Inner Try: Handles the math operation
            try {
                System.out.println("Performing division...");
                int result = numbers[1] / divisor; 
                System.out.println("Result: " + result);
            } 
            catch (ArithmeticException e) {
                System.out.println("Inner Catch: Cannot divide by zero!");
            }

            // This line will trigger the Outer Catch because index 5 doesn't exist
            System.out.println("Accessing invalid index: " + numbers[5]);

        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer Catch: You tried to access an index that doesn't exist.");
        }

        System.out.println("Program finished safely.");
    }
}

