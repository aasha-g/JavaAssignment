package exceptionHandling;

public class HierarchyDemo {
    public static void main(String[] args) {
       
        Exception myEx = new NullPointerException("Oops!");

        
        System.out.println("Is it an Exception? " + (myEx instanceof Exception));
        System.out.println("Is it a Throwable? " + (myEx instanceof Throwable));
        
        try 
        {
            int x = 10 / 0;
        } catch (Throwable t) 
        {
            System.out.println("Caught by the grandparent: " + t.getClass().getSimpleName());
        }
    }
}

