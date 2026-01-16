package stringAssignment;

import java.util.Scanner;

public class WordPrint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:"); 
        String str = sc.nextLine();

        str = str.trim();      //Java is easy programming language
        int sp = 0;
            if (str.isEmpty()) {
            System.out.println("Number of Words: 0");
            }
            else
            {
            	for(int i = 0;i<str.length();i++)
            	{ 
            		if (str.charAt(i)==' ')
            		{
            			int ep=i;
            			System.out.println(str.substring(sp,ep));
            			sp=ep+1;
            		}
            	}
            }
          sc.close();              //output:substring(sp,ep)
                                   //java : sp=0 ep=4
	}                              //is   : sp=5 ep=7
                                   //a    : sp=8 ep=9
}

