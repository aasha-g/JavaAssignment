/*Assignment 2: Custom Exception for Invalid Age
Implement a custom exception for invalid age input.*/

package exceptionHandling;

//Custom Exception
class AgeNotValidException extends Exception {
 public AgeNotValidException(String message) {
     super(message);
 }
}

public class AgeValidation {

 // Method to validate age
 static void validateAge(int age) throws AgeNotValidException {
     if (age <= 0 || age > 60) {
         throw new AgeNotValidException("Invalid Age! Age must be between 1 and 60.");
     }
     System.out.println("Age accepted: " + age);
 }

 public static void main(String[] args) {

     int age = 75;  

     try {
         validateAge(age);
     } catch (AgeNotValidException e) {
         System.out.println("Exception: " + e.getMessage());
     }

     System.out.println("Program continues...");
     
     //Output:Exception: Invalid Age! Age must be between 1 and 60.
                       //Program continues...

     
     
     
     
     
 }
}
