/*Assignment 1: Sum of Natural Numbers using for Loop
Write a program that:
Takes an integer N as input.
Uses a for loop to find the sum of first N natural numbers.*/

package internshipAssignments_1;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		
    int N = 10, sum=0, i=1;
		
	
    for(i=1;i<=N;i++)
    {
      sum = sum +i;
    }
    
    System.out.println("sum of natural numbers is:"+""+sum);
    
    
    /*  while (i<=N) 
	{
		sum = sum + i;
		i++;
	}
	
	
	System.out.println( "Sum of natural numbers is:"   + " " + sum);*/
	
    
    
   // Output: sum of natural numbers is:55

    
    
    
    
    
  
	         
	}

}
