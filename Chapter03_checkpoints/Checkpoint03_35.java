package Chapters.Chapter03_checkpoints;

import java.util.Scanner;

public class Checkpoint03_35 {

	public static void main(String[] args) {

		System.out.println("Enter your score");
		Scanner input = new Scanner(System.in);
		double x = input.nextDouble();
		double scale = 10;

		double score;
		if (x > 10)
			score = 3 * scale;
		else
			score = 4 * scale;

		
		double tax; 
		double income = input.nextDouble();
		if (income > 10000)
			tax = income * 0.2;
		else
			tax = income * 0.17 + 1000;

	
	
	
		double number = input.nextDouble();
		if(number % 3 == 0)
		System.out.println("i") ;

		else
			System.out.println("j");
		
	}

}
