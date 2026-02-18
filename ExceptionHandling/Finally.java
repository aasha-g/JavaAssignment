package exceptionHandling;

import java.util.Scanner;

public class FinallyDemo {

	public static void main(String[] args) {
		
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a number: ");
       int n = sc.nextInt();
        
        try {
            
            System.out.println(100 / n);
        } 
        catch (Exception e) 
        {
            System.out.println("Something went wrong!");
        } 
        finally 
        {
            
            System.out.println("Closing the scanner...");
            sc.close();
        }
        
         System.out.println("Program is completed.....");
    }


	}



