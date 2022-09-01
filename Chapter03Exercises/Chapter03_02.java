package Chapters.Chapter03Exercises;

import java.util.Scanner;

public class Chapter03_02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number1 = (int)(System.currentTimeMillis() % 10 );
		int number2 = (int)(System.currentTimeMillis() /7 % 10 );
		int number3 = (int)(System.currentTimeMillis() /70 % 10 );
		
		System.out.println("what is " + number1 + " + " + number2 + "+" + number3 + "?");
		
		int answer = input.nextInt();
		
		 System.out.println(number1 + number2 + number3 == answer );
	}

}
