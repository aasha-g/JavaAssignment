/*Assignment 2: Exception Hierarchy
Show how Throwable is the parent of Exception and Error.*/

package exceptionHandling;

public class HierarchyDemo {
    public static void main(String[] args) {
       
        Exception Ex = new NullPointerException();

        
        System.out.println("Is it an Exception? " + (Ex instanceof Exception));
        System.out.println("Is it a Throwable? " + (Ex instanceof Throwable));
        
        try 
        {
            int x = 10 / 0;
        } catch (Throwable t) 
        {
            System.out.println("Caught by the grandparent: " + t.getClass().getSimpleName());
        }
    }
}
        /*Output: Is it an Exception? true
          Is it a Throwable? true
          Caught by the grandparent: ArithmeticException*/
