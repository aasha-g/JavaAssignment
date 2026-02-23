/*
Assignment 1: Creating a Custom Exception
Create a LowBalanceException for bank transactions.*/


package exceptionHandling;

//1. The Custom Exception 
class LowBalanceException extends Exception {
 public LowBalanceException(String message) {
     super(message);
 }
}

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
     
    // Output: Current Balance: $500
     //Trying to withdraw: $1000
     //Error: Transaction Denied: Insufficient Funds!

 }
}
