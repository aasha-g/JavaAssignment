/*Assignment 5: Exception Propagation
Demonstrate exception propagation in a method call stack.*/

package exceptionHandling;

public class Propagation {

	public static void main(String[] args) {
		
		try 
		{
            manager();
        } catch (NullPointerException e) 
		{
            System.out.println("Manager: I'll handle this error!");
        }
    }

    static void manager() {
        worker(); // calls the worker
    }

    static void worker() {
        String text = null;
        System.out.println(text.length()); // This triggers the error

        
        //Output:Manager: I'll handle this error!
	}

}
