package Chapters.Chapter04Exercises;

import java.util.Scanner;

public class Chapter04_11 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("enter a decimal value (0 to 15 ): ");
		int decimal = input.nextInt();
           if (decimal >= 10 && decimal<=15 ) {
			
			switch(decimal) {
			
			case 10:System.out.println("The hex value is A");break;
			case 11:System.out.println("The hex value is B");break;
			case 12:System.out.println("The hex value is C");break;
			case 13:System.out.println("The hex value is D");break;
			case 14:System.out.println("The hex value is E");break;
			case 15:System.out.println("The hex value is F");break;
			}
           }else if ( decimal >= 0 && decimal <= 9 ) {
        	  System.out.println("the hex value is " + decimal); 
           }else {
        	   System.out.println("invalid input");
}

	}
		}