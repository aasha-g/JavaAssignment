package stringAssignment;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");   //Java
        String input = sc.nextLine();

        String reversed = "";

                                                                  //length=4
        for (int i = input.length() - 1; i >= 0; i--) {           //i=3
            reversed = reversed + input.charAt(i);        //points at 3-->a
        }

        System.out.println("Reversed string: " + reversed);

        sc.close();
	}

}

