/*Assignment : Using getMessage() and printStackTrace()
Print detailed exception messages.*/

package exceptionHandling;

public class PrintStack {

	public static void main(String[] args) {
		try 
		{
            int result = 10 / 0; 
            
        } catch (ArithmeticException e) 
		{
            
            System.out.println("Simple Message: " + e.getMessage());

            System.out.println("-----------------------------------");

            // 2. printStackTrace() - Detailed map
            System.out.println("Full Trace:");
            e.printStackTrace();
        }
    }
            /*Output:Simple Message: / by zero
	-----------------------------------
	Full Trace:
	java.lang.ArithmeticException: / by zero
		at exceptionHandling.PrintStack.main(PrintStack.java:11)*/


	}


