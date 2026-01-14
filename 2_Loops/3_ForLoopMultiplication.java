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
        
	}

}

