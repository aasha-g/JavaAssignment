package exceptionHandling;

public class NegativeCheck {
	
	static void checkNumber(int num) 
	{
        if (num < 0) 
        {
            throw new RuntimeException("Number cannot be negative");
        }
            System.out.println("Valid number: " + num);
    }

	public static void main(String[] args) {
		
		 try 
		 {
	         checkNumber(-5);   // change value to test
	     } 
		 catch (RuntimeException e) 
		 {
	         System.out.println("Exception caught: " + e.getMessage());
	     }
		
		
	}

}

