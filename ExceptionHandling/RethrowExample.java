/*Assignment 5: Rethrowing Exceptions
Catch an exception and rethrow it.*/

package exceptionHandling;

public class RethrowExample {

    public static void withdraw(int amount) {
        try {
            if (amount > 1000) 
            {
               throw new ArithmeticException("Insufficient funds for large withdrawal.");
            }
            
            System.out.println("Withdrawal successful: $" + amount);
            
            } catch (ArithmeticException e) 
            {
            System.out.println("Local Log: A withdrawal error occurred.");
            
            throw e; 
        }
    }

    public static void main(String[] args) {
        try {
            withdraw(5000); 
        } catch (ArithmeticException e) {
           
            System.err.println("Main System Alert: " + e.getMessage());
        }
    }
    
   /*Output: Local Log: A withdrawal error occurred.
    Main System Alert: Insufficient funds for large withdrawal.*/
}
