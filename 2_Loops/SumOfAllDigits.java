/*4) Given
int a = 641538927;
get the sum of all the digits of the number.*/


package internshipAssignments_1;

public class SumOfAllDigits {

	public static void main(String[] args) {
		
		int a = 641538927;
        int sum = 0;
        
		while(a!=0)
		{
			sum += a%10; //7+2+9+8+3+5+1+4+6
			a/=10;  //64153892,6415389,
		}
		
		System.out.println("sum of all numbers is " +sum);
		
		//Output:sum of all numbers is 45
	}

}
