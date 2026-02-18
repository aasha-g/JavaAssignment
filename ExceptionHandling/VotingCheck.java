package exceptionHandling;

class AgeException extends Exception {//user defined exception
 public AgeException(String message) {
     super(message);
 }
}

public class VotingCheck {

 static void checkAge(int age) throws AgeException {
     if (age < 18) {
         throw new AgeException("You are not eligible to vote.");
     } else {
         System.out.println("You are eligible to vote.");
     }
 }

 public static void main(String[] args) {
     try {
         checkAge(16);   // change age to test
     } catch (AgeException e) {
         System.out.println("Exception caught: " + e.getMessage());
     }
     try {
		checkAge(20);
	} catch (AgeException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 }
}

