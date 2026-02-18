package exceptionHandling;

public class ThrowStatement {
	
	 static void checkNumber(int num) {
	        if (num < 0) 
	        {
	            throw new ArithmeticException("Negative number not allowed");
	        }
	            System.out.println("Valid number: " + num);
	    }

	public static void main(String[] args) {
		
		 try {
	            checkNumber(-5);   // change value to test
	         } catch (ArithmeticException e)
		     {
	            System.out.println("Exception caught: " + e.getMessage());
	         }
	}

}

