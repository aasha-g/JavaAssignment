package exceptionHandling;

import java.util.logging.Level;
import java.util.logging.Logger;

class ValidationException extends Exception {
    public ValidationException(String message) {
        super(message);
    }
}

public class LoggerAssignment {
    
    private static final Logger logger = Logger.getLogger(LoggerAssignment.class.getName());

    public static void validate(int code) throws ValidationException {
        if (code < 100) {
            throw new ValidationException("Invalid Secret Code: " + code);
        }
        System.out.println("Access Granted!");
    }

    public static void main(String[] args) {
        try {
            validate(50); 
        } catch (ValidationException e) {
            logger.log(Level.SEVERE, "Validation failed in system", e);
        }
    }
}
