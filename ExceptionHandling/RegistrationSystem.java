package exceptionHandling;

//  Exception for Age issues
class InvalidAgeEx extends Exception {
   
    public InvalidAgeEx(String message) {
        super(message);
    }
}

// Exception for Name issues
class InvalidNameException extends Exception {
        
    public InvalidNameException(String message) {
        super(message);
    }
}

public class RegistrationSystem {
 
    public static void registerUser(String name, int age) 
           throws InvalidNameException, InvalidAgeException {
        
        if (name == null || name.isEmpty()) {
            throw new InvalidNameException("Name cannot be empty!");
        }
        
        if (age < 18) {
            throw new InvalidAgeException("User must be at least 18 years old.");
        }

        System.out.println("Registration successful for: " + name);
    }

    public static void main(String[] args) {
        try 
        {
            // This will trigger the InvalidNameException
            registerUser("", 25); 

        } catch (InvalidNameException e) 
        {
            System.err.println("Caught Name Exception: " + e.getMessage());
            
        } catch (InvalidAgeException e) 
        {
            System.err.println("Caught Age Exception: " + e.getMessage());
            
        } finally 
        {
            System.out.println("Registration attempt finished.");
        }
    }
}
