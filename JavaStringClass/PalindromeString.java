
package stringAssignment;

import java.util.Scanner;

public class PalindromeCheck {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String original = scanner.nextLine();  //madam
        
        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--) {      //5-1=4  i=4,3,2,1,0
            reversed = reversed + original.charAt(i);           //points at the position 4 ie m
        }                                                       //m,a,d,a,m--->reverse

        if (original.equalsIgnoreCase(reversed)) {              //madam=madam
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }

        scanner.close();
	}

}
