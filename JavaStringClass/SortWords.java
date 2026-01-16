package stringAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class SortWords {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence:");
        String input = scanner.nextLine();         //Hello world

        
        String[] words = input.split(" ");  //splits at the space-->["Hello","world"]

               Arrays.sort(words);  //sorts strings in alphabetical order (A-Z)

       
        System.out.println("\nWords in alphabetical order:");
        for (String word : words) {         
            System.out.print(word + " ");
        }
        
        scanner.close();

	}

}

