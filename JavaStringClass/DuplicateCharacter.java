package stringAssignment;

import java.util.Scanner;

public class DuplicateCharacters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine().toLowerCase();     

        char[] chars = str.toCharArray();             

        System.out.print("Duplicate characters are:");

            for (int i = 0; i < chars.length; i++) {        

            if (chars[i] == ' ')                           
                continue;                     

            int count = 1;

            for (int j = i + 1; j < chars.length; j++) {  
                if (chars[i] == chars[j]) {               
                    count++;
                  
                }
            }

            if (count > 1 && chars[i] != '0') {          
                System.out.print(chars[i]);
            }
        }

       sc.close();

	}

}

