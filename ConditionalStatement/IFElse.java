package internshipAssignments;

public class EvenAndOddNumbers {

	public static void main(String[] args) {
		
		int a = 641538927;
        int eCount = 0;
        int oCount = 0;

        while (a != 0) {
            int digit = a % 10;
            if (digit % 2 == 0) {
            	eCount++;
            } else {
            	oCount++; 
            }
            a /= 10;
        }

        System.out.println("Even digits: " + eCount);
        System.out.println("Odd digits: " + oCount);

	}

}

