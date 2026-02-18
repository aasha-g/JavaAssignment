package exceptionHandling;

public class NullPointer_Exception {

	
	public static void main(String[] args) {
		
	    System.out.println("Program is started.....");
         
	    String s = null;
	    
	    try
	    {
	    	System.out.println(s.length());
	    }
	    catch(NullPointerException e)
	    {
	    	System.out.println("Handled Exception...");
	    	System.out.println(e.getMessage());
	    }
	    
	    System.out.println("Program is completed.....");
	}

}
