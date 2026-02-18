package exceptionHandling;

// Define the Custom Exception
class InvalidAgeException extends Exception {

 public InvalidAgeException(String message) {
     super(message);
 }

// Main Class to test the logic
public class AgeValidator {

 public static void checkAge(int age) throws InvalidAgeException {
     if (age < 0 || age > 120) {
         // Trigger the custom exception for invalid input
         throw new InvalidAgeException("Age " + age + " is not realistic!");
     }
     System.out.println("Valid age: " + age);
 }

 public static void main(String[] args) {
     try {
         // Test with an invalid age
         checkAge(-5); 
     } catch (InvalidAgeException e) {
         System.err.println("Caught Error: " + e.getMessage());
     }
 }
}
}
