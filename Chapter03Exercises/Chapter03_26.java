package Chapters.Chapter03Exercises;

import java.util.Scanner;

public class Chapter03_26 {

	public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
     System.out.println("enter a number  : ");
		double number = input.nextDouble();
		
		if (number % 5 == 0 && number % 6 == 0 ) {
			System.out.println("it is divisible by 5 and 6");}
		
		if (number % 5 == 0 || number % 6 == 0) {
			System.out.println("it is divisible by 5 or 6");
		if (number % 5 == 0 ^ number % 6 == 0) {
		}
		
		}
		
		
		
		
		
	}

}
