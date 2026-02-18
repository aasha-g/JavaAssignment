package exceptionHandling;

//1. The Custom Exception (Not public)
class LowBalanceException extends Exception {
 public LowBalanceException(String message) {
     super(message);
 }
}

//2. The Main Class (Matches the filename)
public class BankSystem {
 
 public static void withdraw(int balance, int amount) throws LowBalanceException {
     System.out.println("Current Balance: $" + balance);
     System.out.println("Trying to withdraw: $" + amount);

     if (amount > balance) {
         // Throw our custom error if the math doesn't work
         throw new LowBalanceException("Transaction Denied: Insufficient Funds!");
     }

     System.out.println("Success! New Balance: $" + (balance - amount));
 }

 public static void main(String[] args) {
     try {
         // This will trigger the exception
         withdraw(500, 1000); 
         
     } catch (LowBalanceException e) {
         // Catching our specific custom error
         System.err.println("Error: " + e.getMessage());
     }
 }
}
