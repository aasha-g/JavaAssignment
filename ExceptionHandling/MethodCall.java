/*Assignment 4: Exception in Method Call
Write a method that throws an exception and handle it in main().*/

package exceptionHandling;

public class MethodCall {

	public static void main(String[] args) {
		
		try 
		{
            divide(10, 0);
        } catch (ArithmeticException e) 
		{
            System.out.println("Error handled in main: You cannot divide by zero!");
        }
    }

    
    static void divide(int num, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException();
        }
        System.out.println((num / divisor));

	}
          //Output: Error handled in main: You cannot divide by zero!
}
