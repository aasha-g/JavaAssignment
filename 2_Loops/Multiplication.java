/*Assignment 2: Multiplication Table using For Loop
Write a program that:
Accepts an integer.
Uses a for loop to print the multiplication table of that number (up to 10)*/


package internshipAssignments_1;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		 
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
       
        for(int i =1;i<=10;i++) 
        {
         System.out.println(number+"x"+ i +""+"="+""+(number*i));	
        }
        sc.close();
		
     /*   int i = 1;
        while(i<=10)
        {
        	 System.out.println(number+"x"+ i +""+"="+""+(number*i));
        	 i++;
        } */	 
        
      /*  Output:Enter a number: 3
                3x1=3
        		3x2=6
        		3x3=9
        		3x4=12
        		3x5=15
        		3x6=18
        		3x7=21
        		3x8=24
        		3x9=27
        		3x10=30
           */
        
        
	}
	

}
