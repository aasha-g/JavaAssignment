
package exceptionHandling;

import java.util.Scanner;

public class Exception_1 {

	public static void main(String[] args) {
		System.out.println("Program is started.....");
		 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		
        int n = sc.nextInt();
        
        try {
         System.out.println(100/n);
        }
        catch(Exception e){
        	
        	 System.out.println("Invalid data"+e.getMessage());
        }
        System.out.println("Program is completed.....");
        
        
        sc.close();

	}

}
