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

}
