//5) Find the factorial of given number and print for factorial of 1.

package internshipAssignments_1;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		
		long factorial = 1;                //n!=n(n-1)(n-2)....
		
		
		for(int i=1;i<=n;i++)      //n=3
		{
			factorial *= i;        //1*1,1*2,(2*3=6)
		}
		
		System.out.println("Factorial of "+n+ " is: "+factorial);
		sc.close();
   
		//output:Enter a number : 3
		//Factorial of 3 is: 6
	}
        
}

