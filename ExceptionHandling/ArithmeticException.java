package exceptionHandling;

import java.util.Scanner;

public class ArithmeticException_1 {

	public static void main(String[] args) {
		
	    System.out.println("Program is started.....");
		 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		
        int n = sc.nextInt();
        
       // System.out.println(100/n);
        
       try 
        {
         System.out.println(100/n);
        }
        catch(ArithmeticException e)
        {
        	
        	 System.out.println("Invalid data");
        }
        
        System.out.println("Program is completed.....");
        
        
        sc.close();
	}

}

