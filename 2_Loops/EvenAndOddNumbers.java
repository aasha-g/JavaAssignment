//) Given
//int a = 641538927;
//count the number of even and odd digits in the above number.


package internshipAssignments_1;

public class EvenAndOddNumbers {

	public static void main(String[] args) {
		
		int a = 641538927;
        int eCount = 0;
        int oCount = 0;

        while (a != 0) {
            int digit = a % 10;   //Modulo operator gives remainder
            if (digit % 2 == 0) {
            	eCount++;
            } else {
            	oCount++; 
            }
            a /= 10;     //division:removes decimal part or last digit
        }

        System.out.println("Even digits: " + eCount);
        System.out.println("Odd digits: " + oCount);

        
       // output:Even digits: 4
       // Odd digits: 5
	}
	
	
	

}
