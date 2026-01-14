package internshipAssignments_1;

import java.util.Scanner;

public class Fibonacciseries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        int a = 0, b = 1;

        System.out.print("Fibonacci Series: ");

        for (int i = 4; i <= n; i++) {  
            System.out.print(a + " ");  //a=0,1,1,2

            int next = a + b; //1,2,3,5
            a = b; //a=1 ,1,2,3 
            b = next;//b=1,2,3,5
        }

        sc.close();   
			  
		   }
	}


