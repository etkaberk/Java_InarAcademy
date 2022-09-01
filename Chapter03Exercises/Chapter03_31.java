package Chapters.Chapter03Exercises;

import java.util.Scanner;

public class Chapter03_31 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("enter the exchange rate from dollars to RMB : ");
		double rate = input.nextDouble();
		
		System.out.println("enter 0 to convert dollars to RBM and 1 vice versa :");
		double number = input.nextDouble();
	
		System.out.println("enter the dollar amount : ");
		double money = input.nextDouble();
		
		
		if (number == 0 ) {
			double yuan = (money * rate );
			System.out.println("you have" + yuan + "yuan" );
			}
			if (number == 1) {
		double dollars = (money / rate);
		System.out.println("you have " + dollars + "dollars");
			}
		
		}
		
		
		
	}


