package Chapters.Chapter03_checkpoints;

import java.util.Scanner;

public class Checkpoint03_07 {

	public static void main(String[] args) {
          	Scanner input = new Scanner(System.in);
          	
		System.out.println("enter a number ");
		double number = input.nextDouble();
		if (number % 2 == 0)
			System.out.println(number + " is even.");
		
		System.out.println(number + " is odd.");



		if (number % 2 == 0)
			System.out.println(number + " is even.");
		else
			System.out.println(number + " is odd.");

		
		
		
	}

}
