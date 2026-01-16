package stringAssignment;

import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence:"); //hello world
        String input = scanner.nextLine();

        input = input.trim();      //removes extra spaces

            if (input.isEmpty()) {
            System.out.println("Word count: 0");
        } else {
            // Split the string by one or more spaces
            String[] words = input.split("\\s+");  //["hello", "world"]
            
            System.out.println("Number of words: " + words.length); //length=2
        }

        scanner.close();
	}

}

