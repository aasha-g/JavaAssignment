/*Assignment 2: Handle ArrayIndexOutOfBoundsException
Create an array and intentionally access an out-of-bounds index.*/

package exceptionHandling;

public class ArrayOutOfBound_exc {

	public static void main(String[] args) {
		
        System.out.println("Program is started.....");
        
        int[] numbers = {10, 20, 30}; // This array has indexes 0, 1, and 2
        
        try {
            // Trying to access index 5, which does not exist
            System.out.println("Value at index 5: " + numbers[3]);
            String s=null;
            System.out.println(s.length());
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("index that is out of range");
        }
        catch(ArithmeticException e)
        {
        	System.out.println("Airthmetic exception");
        }
        catch(Exception e)
        {
        	System.out.println(" exception occured");
        }
        
        	
        
        System.out.println("Program is completed.....");
        
        //Output:Program is started.....
        //index that is out of range
        //Program is completed.....
    }

	}


