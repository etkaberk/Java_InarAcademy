package Chapters.Chapter04Exercises;

import java.util.Scanner;

public class Chapter04_13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a letter: ");
		String s = input.next();
		char c = s.charAt(0);

		if (Character.isLetter(c))
		{
			switch(Character.toUpperCase(c))
			{
				case 'A': System.out.println(c + " is a vowel");break;
				case 'E': System.out.println(c + " is a vowel");break;
				case 'I': System.out.println(c + " is a vowel");break;
				case '0': System.out.println(c + " is a vowel");break;
				case 'U': System.out.println(c + " is a vowel");break;
				default : System.out.println(c + " is a consonant"); 
			}
		}
		
		
		
		
		
	}

}
