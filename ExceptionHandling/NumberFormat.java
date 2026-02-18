package exceptionHandling;

public class NumberFormatEx {

	public static void main(String[] args) {
		
		String s = "15$"; 
		
        try {
            int num = Integer.parseInt(s);
            System.out.println("Result: " + num);
            } catch (NumberFormatException e)
            {
            System.out.println("Invalid input: Not a number.");
            }
 }
}

