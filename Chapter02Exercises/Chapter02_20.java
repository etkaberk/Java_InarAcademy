package Chapters.Chapter02Exercises;

import java.util.Scanner;

public class Chapter02_20 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter balance and interes rate :");
		
		double balance = input.nextDouble();
	
		double interestRate = input.nextDouble();
		
		double interest = balance * (interestRate / 1200);
		
		System.out.println("the interest is " + interest );
		
		
		
		
		
		

	}

}
